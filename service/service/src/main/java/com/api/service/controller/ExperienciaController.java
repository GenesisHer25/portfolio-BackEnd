package com.api.service.controller;

import com.api.service.model.Experiencia;
import com.api.service.service.ExperienciaService;
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
public class ExperienciaController {
    
    @Autowired()
    ExperienciaService experienciaService;
    
    @GetMapping("/experiencia/todos")
    public List<Experiencia> getExperiencia(){
        return experienciaService.getTodos();
    }
    
    @GetMapping("/experiencia/{idAspirante}")
    public List<Experiencia> getExperienciaByAspirante(@PathVariable Long idAspirante){
        return experienciaService.getExperienciaByAspirante(idAspirante);
    }
    
    @PostMapping("/experiencia/crear")
    public String guardarExperiencia(@RequestBody Experiencia exp){
        experienciaService.guardarExperiencia (exp);
        return "Su experiencia fue guardada exitosamente";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String borrarExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    } 
    
    @PutMapping("/experiencia/editar")
    public String editarExperiencia(@RequestBody Experiencia exp){
        experienciaService.editarExperiencia(exp);
        return "Se edito con exito la experiencia obtenida";
    }
}
