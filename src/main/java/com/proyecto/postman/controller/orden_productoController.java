package com.proyecto.postman.controller;

import com.proyecto.postman.model.orden_productoEntity;
import com.proyecto.postman.request.orden_productoRequest;
import com.proyecto.postman.response.orden_productoResponse;
import com.proyecto.postman.service.orden_productoInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orden_producto_entity")
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class orden_productoController {
    @Autowired
    private final orden_productoInterface orden_productoInterface;
    @GetMapping
    public List<orden_productoResponse> getorden_producto(){
        return orden_productoInterface.getorden_producto();
    }
    @GetMapping("/{id}")
    public orden_productoResponse getorden_productoById(@PathVariable Long id){
        return orden_productoInterface.getorden_productoById(id);
    }
    @PostMapping
    public orden_productoResponse createorden_producto(@RequestBody orden_productoEntity orden_productoEntity){
        return orden_productoInterface.createorden_producto(orden_productoEntity);
    }

    @PutMapping("/{id}")
    public orden_productoResponse actualizaorden_producto(@PathVariable Long id, @RequestBody orden_productoEntity orden_productoEntity){
        return orden_productoInterface.actualizaorden_producto(id, orden_productoEntity);
    }

    @PostMapping("/{id}")
    public void deleteorden_producto(@PathVariable Long id){
        orden_productoInterface.deleteorden_producto(id);
    }

}
