package com.proyecto.postman.controller;

import com.proyecto.postman.model.productoEntity;
import com.proyecto.postman.response.productoResponse;
import com.proyecto.postman.service.productoInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto_entity")
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class productoController {
    @Autowired
    private productoInterface productoInterface;
    @GetMapping
    public List<productoResponse> gettodosproductos() {

        return productoInterface.gettodosproductos();
    }
    @GetMapping("/{id}")
    public productoResponse getproductoById(@PathVariable Long id) {

        return productoInterface.getproductoById(id);
    }
    @PostMapping
    public productoResponse addproducto(@RequestBody productoEntity productoEntity) {
        return productoInterface.addproducto(productoEntity);
    }
    @PutMapping("/{id}")
    public productoResponse updateproducto(@PathVariable Long id,@RequestBody productoEntity productoEntity) {
        return productoInterface.updateproducto(id, productoEntity);
    }
    @PostMapping("/{id}")
    public void deleteproducto(@PathVariable Long id) {
        productoInterface.deleteproducto(id);
    }

    @PostMapping("/productos")
    public void agregarVariosProductos(@RequestBody List<productoEntity> productoEntity) {
        productoInterface.agregarVariosProductos(productoEntity);
    }
}
