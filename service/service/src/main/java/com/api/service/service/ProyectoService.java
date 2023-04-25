package com.api.service.service;




import com.api.service.model.Proyecto;
import com.api.service.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService { 

    @Autowired()
    ProyectoRepository proyectoRepository;
    
    
    @Override
    public List<Proyecto> getTodos() {
        
        return proyectoRepository.findAll();    
    }
    
    @Override
    public List<Proyecto> getProyectoByAspirante(Long idAspirante) {
        
      return proyectoRepository.findByIdAspirante(idAspirante);  
    }

    @Override
    public void guardarProyecto(Proyecto proy) {
    
        proyectoRepository.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        
        proyectoRepository.deleteById(id); 
    }

    @Override
    public void editarProyecto(Proyecto proy) {
        
        proyectoRepository.save(proy);
    }
  
}
