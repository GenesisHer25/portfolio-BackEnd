package com.api.service.repository;

import com.api.service.model.ImagenProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenProyectoRepository extends JpaRepository<ImagenProyecto,Long>{
    
}
