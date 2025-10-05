package com.proyecto.postman.repository;

import com.proyecto.postman.model.productoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<productoEntity,Long> {
}
