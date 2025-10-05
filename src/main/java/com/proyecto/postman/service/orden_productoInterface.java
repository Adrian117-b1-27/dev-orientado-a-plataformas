package com.proyecto.postman.service;

import com.proyecto.postman.model.orden_productoEntity;
import com.proyecto.postman.request.orden_productoRequest;
import com.proyecto.postman.response.orden_productoResponse;

import java.util.List;


public interface orden_productoInterface {
    List<orden_productoResponse> getorden_producto();
    orden_productoResponse getorden_productoById(Long id);
    orden_productoResponse createorden_producto(orden_productoEntity orden_productoEntity);
    orden_productoResponse actualizaorden_producto(Long id,orden_productoEntity orden_productoEntity);
    void deleteorden_producto(Long id);
}
