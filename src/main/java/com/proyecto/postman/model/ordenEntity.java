package com.proyecto.postman.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orden")
public class ordenEntity {
    @Id
    @Column(name = "id_orden", nullable = false, unique = true)
    private Long id;
    @Column(name= "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "total",nullable = false)
    private Double total;

    @OneToMany(mappedBy = "orden_id",cascade=CascadeType.ALL)
    private List<orden_productoEntity> ordenproductoId;
}
