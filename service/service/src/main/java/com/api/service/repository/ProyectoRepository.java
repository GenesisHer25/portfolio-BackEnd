package com.api.service.repository;

import com.api.service.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long>{
    
    List<Proyecto> findByIdAspirante(Long idAspirante);
}
