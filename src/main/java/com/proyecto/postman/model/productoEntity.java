package com.proyecto.postman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class productoEntity {
    @Id
    @Column(name = "id_producto", nullable = false)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name="stock",nullable = false)
    private Integer stock;
    @Column(name="valor",nullable = false)
    private Double valor;
}
