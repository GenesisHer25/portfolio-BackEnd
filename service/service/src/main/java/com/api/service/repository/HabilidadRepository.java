package com.api.service.repository;


import com.api.service.model.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad,Long> {
    
    List<Habilidad> findByIdAspirante(Long idAspirante);
}
