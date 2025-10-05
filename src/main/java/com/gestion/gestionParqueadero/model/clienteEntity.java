package com.gestion.gestionParqueadero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class clienteEntity {
    @Id
    @Column(name = "id_cliente", nullable = false, unique = true)
    private Long id;
    @Column(name = "nombrecompleto",nullable = false)
    private String nombre;
    @Column(name="telefono",nullable = false)
    private String telefono;
    @Column(name = "cedula",nullable = false)
    private String cedula;
    @Column(name="correo")
    private String correo;
}
