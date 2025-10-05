package com.proyecto.postman.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ordenResponse {
    private Long id;
    private LocalDate fecha;
    private Double total;
}
