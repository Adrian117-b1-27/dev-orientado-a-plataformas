package com.proyecto.postman.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ordenRequest {
    private Long id;
    private LocalDate fecha;
    private Double total;
}
