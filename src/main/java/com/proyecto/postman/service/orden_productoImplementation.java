package com.proyecto.postman.service;

import com.proyecto.postman.mappers.orden_productoMapper;
import com.proyecto.postman.model.orden_productoEntity;
import com.proyecto.postman.repository.orden_productoRepository;
import com.proyecto.postman.request.orden_productoRequest;
import com.proyecto.postman.response.orden_productoResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class orden_productoImplementation implements orden_productoInterface {
    @Autowired
    private final orden_productoRepository orden_productoRepository;

    @Autowired
    private final orden_productoMapper orden_productoMapper;
    @Override
    public List<orden_productoResponse> getorden_producto(){
        var ordenproducto= orden_productoRepository.findAll();
        return orden_productoMapper.toResponseList(ordenproducto);
    }
    @Override
    public orden_productoResponse getorden_productoById(Long id) {
        orden_productoEntity entity = orden_productoRepository.findById(id).get();
        return orden_productoMapper.toResponse(entity);
    }

    @Override
    public orden_productoResponse createorden_producto(orden_productoEntity orden_productoEntity) {
    return  orden_productoMapper.toResponse(orden_productoRepository.save(orden_productoEntity));
    }
    @Override
    public orden_productoResponse actualizaorden_producto(Long id,orden_productoEntity orden_productoEntity) {
        var ordenproducto= orden_productoRepository.findById(id).get();
        ordenproducto.setCantidad(orden_productoEntity.getCantidad());
        ordenproducto.setProducto_id(orden_productoEntity.getProducto_id());
        return orden_productoMapper.toResponse(orden_productoRepository.save(ordenproducto));
    }
    @Override
    public void  deleteorden_producto(Long id) {
        orden_productoRepository.deleteById(id);
    }
}
