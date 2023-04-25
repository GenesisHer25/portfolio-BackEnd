package com.api.service.service;

import com.api.service.model.Educacion;
import java.util.List;


interface IEducacionService {
    
    public List<Educacion> getTodos();
    
    public void guardarEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public void editarEduacion(Educacion edu);
    
    public List<Educacion> getEducacionByAspirante(Long idAspirante);

}
