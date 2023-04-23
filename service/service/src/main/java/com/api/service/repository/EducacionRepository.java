package com.api.service.repository;

import com.api.service.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository<Educacion,Long> {
    
}
