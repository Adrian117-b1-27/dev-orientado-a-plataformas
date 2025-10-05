package com.proyecto.postman.service;

import com.proyecto.postman.model.ordenEntity;
import com.proyecto.postman.model.productoEntity;
import com.proyecto.postman.response.productoResponse;


import java.util.List;

public interface productoInterface {
    List<productoResponse> gettodosproductos();
    productoResponse getproductoById(Long id);
    productoResponse updateproducto(Long id, productoEntity Entity);
    void deleteproducto(Long id);
    productoResponse addproducto(productoEntity Entity);
    void agregarVariosProductos(List<productoEntity> productoEntity);
}
