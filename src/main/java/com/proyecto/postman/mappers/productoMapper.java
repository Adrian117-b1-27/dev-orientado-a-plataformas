package com.proyecto.postman.mappers;

import com.proyecto.postman.model.productoEntity;
import com.proyecto.postman.request.productoRequest;
import com.proyecto.postman.response.productoResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel="spring")
public interface productoMapper {
    productoEntity toEntity(productoRequest productoRequest);
    productoRequest toRequest(productoEntity productoEntity);
    productoResponse toResponse(productoEntity productoEntity);
    List<productoResponse> toResponseList(List<productoEntity> productoEntity);
}
