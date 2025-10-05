package com.proyecto.postman.service;

import com.proyecto.postman.model.ordenEntity;
import com.proyecto.postman.response.ordenResponse;

import java.util.List;

public interface ordenInterface {
    List<ordenResponse> getorden();
    ordenResponse getordenById(Long id);
    ordenResponse actualizarorden(Long id,ordenEntity ordenEntity);
    ordenResponse crearorden(ordenEntity ordenEntity);
    ordenResponse eliminarorden(Long id);
}
