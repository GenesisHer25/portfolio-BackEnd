package com.api.service.service;

import com.api.service.model.Habilidad;
import java.util.List;


interface IHabilidadService {
    
    public List<Habilidad> getTodos();
    
    public List<Habilidad> getHabilidadByAspirante(Long idAspirante);
    
    public void guardarHabilidad(Habilidad hab);
    
    public void borrarHabilidad(Long id);
    
    public void editarHabilidad(Habilidad hab);
    
    public void editarTodoHabilidad(List<Habilidad> listHabilidad);
    
}
