package com.proyecto.postman.controller;

import com.proyecto.postman.model.ordenEntity;
import com.proyecto.postman.model.orden_productoEntity;
import com.proyecto.postman.response.ordenResponse;
import com.proyecto.postman.service.ordenInterface;
import com.proyecto.postman.service.orden_productoInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orden_entity")
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class ordenController {
    @Autowired
    private ordenInterface ordenInterface;
    @GetMapping
    public List<ordenResponse> getorden(){
        return ordenInterface.getorden();
    }
    @GetMapping("/{id}")
    public ordenResponse getordenById(@PathVariable Long id){
        return ordenInterface.getordenById(id);
    }
    @PutMapping("/{id}")
    public ordenResponse actualizarorden(@PathVariable Long id, @RequestBody ordenEntity ordenEntity){
        return ordenInterface.actualizarorden(id, ordenEntity);
    }
    @PostMapping
    public ordenResponse crearorden(@RequestBody ordenEntity ordenEntity){
        return ordenInterface.crearorden(ordenEntity);
    }
    @PostMapping("/{id}")
    public ordenResponse eliminarorden(@PathVariable Long id){
        return ordenInterface.eliminarorden(id);
    }
}
