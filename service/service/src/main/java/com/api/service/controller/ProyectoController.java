package com.api.service.controller;


import com.api.service.model.Proyecto;
import com.api.service.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {  
    
    @Autowired()
    ProyectoService proyectoService; 
    
    @CrossOrigin(origins = "*")
    @GetMapping("/proyecto/todos")
    public List<Proyecto> getProyecto(){
        
        return proyectoService.getTodos();
    }
    
    
    @CrossOrigin(origins = "*")
    @GetMapping("/proyecto/{idAspirante}")
    public List<Proyecto> getProyectoByAspirante(@PathVariable Long idAspirante){
        
        return proyectoService.getProyectoByAspirante(idAspirante);
    }
    
    
    @CrossOrigin(origins = "*")
    @PostMapping("/proyecto/crear")
    public String guardarProyecto(@RequestBody Proyecto proy){
        proyectoService.guardarProyecto(proy);
        return "Se guardo exitosamente el proyecto";
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoService.borrarProyecto(id);
    } 
    
    @CrossOrigin(origins = "*")
    @PutMapping("/proyecto/editar/{id}")
    public String editarProyecto(@RequestBody Proyecto proy){
        proyectoService.editarProyecto(proy);
        return "Se edito con exito el proyecto";
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/proyecto/editarlista")
    public void editarTodoProyecto(@RequestBody List<Proyecto> listProyecto){
        proyectoService.editarTodoProyecto(listProyecto);
    }
}
