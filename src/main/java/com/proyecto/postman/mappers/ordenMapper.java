package com.proyecto.postman.mappers;

import com.proyecto.postman.model.ordenEntity;
import com.proyecto.postman.request.ordenRequest;
import com.proyecto.postman.response.ordenResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel="spring")
public interface ordenMapper {
    ordenEntity toEntity(ordenRequest rq);

    ordenResponse toResponse(ordenEntity rq);

    List<ordenResponse> toResponseList(List<ordenEntity> rq);
}
