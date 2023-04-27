
package com.api.service.service;

import com.api.service.model.Proyecto;
import java.util.List;


interface IProyectoService {
    
    public List<Proyecto> getTodos();
    
    public List<Proyecto> getProyectoByAspirante(Long idAspirante); 
    
    public void guardarProyecto(Proyecto proy);
    
    public void borrarProyecto(Long id);
    
    public void editarProyecto(Proyecto proy);
    
    public void editarTodoProyecto(List<Proyecto> listProyecto);
    
}
