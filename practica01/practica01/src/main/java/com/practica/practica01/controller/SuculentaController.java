package com.practica.practica01.controller;

import com.practica.practica01.domain.Suculenta;
import com.practica.practica01.service.SuculentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/suculentas")
public class SuculentaController {

    @Autowired
    private SuculentaService suculentaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var suculentas = suculentaService.getSuculentas();
        model.addAttribute("suculentas", suculentas);
        return "suculenta/listado";
    }

    @GetMapping("/nuevo")
    public String nueva(Suculenta suculenta) {
        return "suculenta/modifica";
    }

    @PostMapping("/guardar")
    public String guardar(Suculenta suculenta) {
        suculentaService.save(suculenta);
        return "redirect:/suculentas/listado";
    }

    @GetMapping("/modificar/{idSuculenta}")
    public String modificar(
            @PathVariable Integer idSuculenta,
            Model model) {

        var suculenta = suculentaService.getSuculenta(idSuculenta);

        if (suculenta.isEmpty()) {
            return "redirect:/suculentas/listado";
        }

        model.addAttribute("suculenta", suculenta.get());
        return "suculenta/modifica";
    }

    @GetMapping("/eliminar/{idSuculenta}")
    public String eliminar(@PathVariable Integer idSuculenta) {
        suculentaService.delete(idSuculenta);
        return "redirect:/suculentas/listado";
    }
}