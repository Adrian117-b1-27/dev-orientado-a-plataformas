package com.proyecto.postman.service;

import com.proyecto.postman.mappers.ordenMapper;
import com.proyecto.postman.model.ordenEntity;
import com.proyecto.postman.repository.ordenRepository;
import com.proyecto.postman.response.ordenResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class ordenImplementation implements ordenInterface {
    @Autowired
    private  final ordenRepository ordenRepository;
    @Autowired
    private final ordenMapper ordenMapper;
    @Override
    public List<ordenResponse> getorden(){

        return ordenMapper.toResponseList(ordenRepository.findAll());

    }
    @Override
    public ordenResponse getordenById(Long id) {
        return ordenMapper.toResponse(ordenRepository.findById(id).get());
    }
    @Override
    public ordenResponse actualizarorden(Long  id,ordenEntity ordenEntity) {
        var ord= ordenRepository.findById(id).get();
        ord.setFecha(ordenEntity.getFecha());
        ord.setTotal(ordenEntity.getTotal());
        return ordenMapper.toResponse(ordenRepository.save(ord));
    }
    @Override
    public ordenResponse crearorden(ordenEntity ordenEntity) {
        return ordenMapper.toResponse(ordenRepository.save(ordenEntity));
    }
    @Override
    public ordenResponse eliminarorden(Long id) {
        ordenRepository.deleteById(id);
        return ordenMapper.toResponse(ordenRepository.findById(id).get());
    }
}
