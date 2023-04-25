package com.api.service.controller;


import com.api.service.service.HabilidadService;
import com.api.service.model.Habilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @GetMapping("/habilidad/todos")
    public List<Habilidad> getHabilidad(){
            return habilidadService.getTodos();
    }
    
    @GetMapping("/habilidad/{idAspirante}")
    public List<Habilidad> getHabilidadByAspirante(@PathVariable Long idAspirante){
         return habilidadService.getHabilidadByAspirante(idAspirante);
    }
    
    @PostMapping("/habilidad/crear")
    public String guardarHabilidad(@RequestBody Habilidad hab){
        habilidadService.guardarHabilidad (hab);
        return "Se agrego exitosamente la habilidad ingresada";
    }
    
    @DeleteMapping("/habilidad/borrar/{id}")
    public String borrarHabilidad(@PathVariable Long id){
        habilidadService.borrarHabilidad(id);
        return "Se elimino exitosamente la habilidad";
    } 
    
    @PutMapping("/habilidad/editar")
    public String editarHabilidad(@RequestBody Habilidad hab){
        habilidadService.editarHabilidad (hab);
        return "Se edito con exito la habilidad";
    }
}
