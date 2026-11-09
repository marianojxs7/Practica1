package com.practica.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name = "suculenta")
public class Suculenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suculenta")
    private Integer idSuculenta;

    @Column(name = "nombre_comun", nullable = false, length = 100)
    private String nombreComun;

    @Column(name = "nombre_cientifico", length = 150)
    private String nombreCientifico;

    @Column(name = "familia", length = 100)
    private String familia;

    @Column(name = "color_principal", length = 50)
    private String colorPrincipal;

    @Column(name = "altura_cm", precision = 6, scale = 2)
    private BigDecimal alturaCm;

    @Column(name = "precio_estimado", precision = 10, scale = 2)
    private BigDecimal precioEstimado;

    @Column(name = "nivel_riego", length = 50)
    private String nivelRiego;

    @Column(name = "ruta_imagen", length = 500)
    private String rutaImagen;
}