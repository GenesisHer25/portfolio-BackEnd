package com.api.service.service;

import com.api.service.model.Experiencia;
import java.util.List;


interface IExperienciaService {
    
    public List<Experiencia> getTodos();
    
    public List<Experiencia> getExperienciaByAspirante(Long idAspirante); 
    
    public void guardarExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Long id);
    
    public void editarExperiencia(Experiencia exp);
    
}
