package com.proyecto.postman.request;

import lombok.Data;

@Data
public class productoRequest {
    private Long id;
    private String nombre;
    private Integer stock;
    private Double valor;
}
