package com.api.service.service;

import com.api.service.model.Experiencia;
import com.api.service.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired()
    ExperienciaRepository experienciaRepository;
    
    
    @Override
    public List<Experiencia> getTodos() {
        return experienciaRepository.findAll();    
    }
    
    @Override
    public List<Experiencia> getExperienciaByAspirante(Long idAspirante) {
        return experienciaRepository.findByIdAspirante(idAspirante);
    }

    @Override
    public void guardarExperiencia(Experiencia exp) {
        
        experienciaRepository.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        
        experienciaRepository.deleteById(id); 
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        experienciaRepository.save(exp);
    }

}
