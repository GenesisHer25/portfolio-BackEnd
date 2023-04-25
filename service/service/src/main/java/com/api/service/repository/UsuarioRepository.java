package com.api.service.repository;

import com.api.service.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
        Usuario findByUsernameAndPassword(String username, String password);
        
        List<Usuario> findByIdAspirante(Long idAspirante);

}
