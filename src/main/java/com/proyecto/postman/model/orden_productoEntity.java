package com.proyecto.postman.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class orden_productoEntity {
    @Id
    @Column(name = "id_orden_producto")
    private Long id;

    @Column(name="cantidad",nullable = false)
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private productoEntity producto_id;

    @ManyToOne
    @JoinColumn(name="orden_id")
    private ordenEntity orden_id;
}
