package com.proyecto.postman.service;

import com.proyecto.postman.mappers.productoMapper;
import com.proyecto.postman.model.productoEntity;
import com.proyecto.postman.repository.productoRepository;
import com.proyecto.postman.response.productoResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class productoImplementation implements productoInterface{
    @Autowired
    private productoRepository productoRepository;

    @Autowired
    private productoMapper productoMapper;
    @Override
    public List<productoResponse> gettodosproductos() {
        var resultado = productoRepository.findAll();
        return productoMapper.toResponseList(resultado);
    }

    @Override
    public productoResponse getproductoById(Long id) {
        return productoMapper.toResponse(productoRepository.findById(id).get());
    }
    @Override
    public productoResponse addproducto(productoEntity productoEntity) {
        return productoMapper.toResponse(productoRepository.save(productoEntity));
    }

    @Override
    public void agregarVariosProductos(List<productoEntity> productoEntities){
        for (productoEntity productoEntity : productoEntities) {
            productoRepository.save(productoEntity);
        }
    }
    @Override
    public productoResponse updateproducto(Long id, productoEntity productoEntity) {
        productoEntity producton = productoRepository.findById(id).get();
        producton.setNombre(productoEntity.getNombre());
        producton.setStock(productoEntity.getStock());
        producton.setValor(productoEntity.getValor());
        return productoMapper.toResponse(productoRepository.save(producton));
    }
    @Override
    public void deleteproducto(Long id) {
        var producto = productoRepository.findById(id).get();
        productoRepository.delete(producto);
    }
}
