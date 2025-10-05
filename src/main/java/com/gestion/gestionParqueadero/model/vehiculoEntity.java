package com.gestion.gestionParqueadero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class vehiculoEntity {
    @Id
    @Column(name="id_vehiculo", unique=true, nullable=false)
    private String id;
    @Column(name="placa",nullable = false)
    private String placa;
    @Column(name="modelo",nullable = false)
    private String modelo;

}
