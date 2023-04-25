
package com.api.service.repository;




import com.api.service.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long>{
    
    List<Experiencia> findByIdAspirante(Long idAspirante);
}
