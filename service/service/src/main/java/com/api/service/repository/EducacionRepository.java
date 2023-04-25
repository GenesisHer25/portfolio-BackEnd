
package com.api.service.repository;


import com.api.service.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long> {

    List<Educacion> findByIdAspirante(Long idAspirante);

}
