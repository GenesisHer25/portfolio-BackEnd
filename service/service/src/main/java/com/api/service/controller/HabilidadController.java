package com.api.service.controller;


import com.api.service.service.HabilidadService;
import com.api.service.model.Habilidad;
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
public class HabilidadController {
    
    @Autowired()
    HabilidadService habilidadService; 
    
    @CrossOrigin(origins = "*")
    @GetMapping("/habilidad/todos")
    public List<Habilidad> getHabilidad(){
            return habilidadService.getTodos();
    }
    
    
    @CrossOrigin(origins = "*")
    @GetMapping("/habilidad/{idAspirante}")
    public List<Habilidad> getHabilidadByAspirante(@PathVariable Long idAspirante){
         return habilidadService.getHabilidadByAspirante(idAspirante);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/habilidad/crear")
    public String guardarHabilidad(@RequestBody Habilidad hab){
        habilidadService.guardarHabilidad (hab);
        return "Se agrego exitosamente la habilidad ingresada";
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/habilidad/borrar/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habilidadService.borrarHabilidad(id);
    } 
    
    @CrossOrigin(origins = "*")
    @PutMapping("/habilidad/editar")
    public String editarHabilidad(@RequestBody Habilidad hab){
        habilidadService.editarHabilidad (hab);
        return "Se edito con exito la habilidad";
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/habilidad/editarlista")
    public void editarTodoHabilidad(@RequestBody List<Habilidad> listHabilidad){
        habilidadService.editarTodoHabilidad(listHabilidad);
    }
}
