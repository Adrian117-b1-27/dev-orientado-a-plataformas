package com.proyecto.postman.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class productoResponse {
    private Long id;
    private String nombre;
    private Integer stock;
    private Double valor;
}
