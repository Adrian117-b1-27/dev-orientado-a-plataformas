package com.proyecto.postman.request;

import com.proyecto.postman.model.ordenEntity;
import com.proyecto.postman.model.productoEntity;
import lombok.Data;

@Data
public class orden_productoRequest {
    private Long id;
    private Integer cantidad;
    private productoEntity producto_id;
    private ordenEntity orden_id;

}
