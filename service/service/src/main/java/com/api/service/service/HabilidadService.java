package com.api.service.service;


import com.api.service.model.Habilidad;
import com.api.service.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {

    @Autowired()
    HabilidadRepository habilidadRepository;
    
    
    @Override
    public List<Habilidad> getTodos() {
        
        return habilidadRepository.findAll();    
    }
    
    @Override
    public List<Habilidad> getHabilidadByAspirante(Long idAspirante) {
        
        return habilidadRepository.findByIdAspirante(idAspirante);
    }

    @Override
    public void guardarHabilidad(Habilidad hab) {
    
         habilidadRepository.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        
        habilidadRepository.deleteById(id); 
    }

    @Override
    public void editarHabilidad(Habilidad hab) {
        
        habilidadRepository.save(hab);
        
    }

    @Override
    public void editarTodoHabilidad(List<Habilidad> listHabilidad) {
    
    habilidadRepository.saveAll(listHabilidad);
    
    }

}