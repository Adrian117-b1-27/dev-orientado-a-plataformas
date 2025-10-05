package com.proyecto.postman.mappers;

import com.proyecto.postman.controller.orden_productoController;
import com.proyecto.postman.model.orden_productoEntity;
import com.proyecto.postman.request.orden_productoRequest;

import com.proyecto.postman.response.orden_productoResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel="spring")
public interface orden_productoMapper {

    /**
     * Convierte un DTO de solicitud a una Entidad.
     * Se usa al crear o actualizar un producto.
     */
    orden_productoEntity toEntity(orden_productoRequest rq);

    /**
     * Convierte una Entidad a un DTO de respuesta.
     * Se usa al devolver un producto al cliente.
     */
    orden_productoResponse toResponse(orden_productoEntity entity);
    /**
     * NUEVO MÉTODO: Convierte una lista de Entidades a una lista de DTOs de respuesta.
     */
    List<orden_productoResponse> toResponseList(List<orden_productoEntity> entities);
}
