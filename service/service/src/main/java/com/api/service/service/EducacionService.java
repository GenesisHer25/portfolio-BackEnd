package com.api.service.service;

import com.api.service.model.Educacion;
import com.api.service.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class EducacionService implements IEducacionService {
    
    @Autowired()
    EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getTodos() {
        
        return educacionRepository.findAll();
    }
    
    @Override
    public List<Educacion> getEducacionByAspirante(Long idAspirante) {
        
        return educacionRepository.findByIdAspirante(idAspirante);
    }

    @Override
    public void guardarEducacion(Educacion edu) {
        
        educacionRepository.save(edu);
    
    }

    @Override
    public void borrarEducacion(Long id) {
        
        educacionRepository.deleteById(id);
        
    }

    @Override
    public void editarEducacion(Educacion edu) {
        
        educacionRepository.save(edu); 
    }
    
    @Override
    public void editarTodoEducacion(List<Educacion> listEducacion) {
       educacionRepository.saveAll(listEducacion);
    }
     
    
}
