package com.proyecto.postman.repository;

import com.proyecto.postman.model.ordenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ordenRepository extends JpaRepository<ordenEntity,Long> {
}
