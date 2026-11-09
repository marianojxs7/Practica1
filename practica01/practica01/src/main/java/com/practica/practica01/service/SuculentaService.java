package com.practica.practica01.service;

import com.practica.practica01.domain.Suculenta;
import com.practica.practica01.repository.SuculentaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SuculentaService {

    private final SuculentaRepository suculentaRepository;

    public SuculentaService(SuculentaRepository suculentaRepository) {
        this.suculentaRepository = suculentaRepository;
    }

    @Transactional(readOnly = true)
    public List<Suculenta> getSuculentas() {
        return suculentaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Suculenta> getSuculenta(Integer idSuculenta) {
        return suculentaRepository.findById(idSuculenta);
    }

    @Transactional
    public void save(Suculenta suculenta) {
        suculentaRepository.save(suculenta);
    }

    @Transactional
    public void delete(Integer idSuculenta) {
        suculentaRepository.deleteById(idSuculenta);
    }
}