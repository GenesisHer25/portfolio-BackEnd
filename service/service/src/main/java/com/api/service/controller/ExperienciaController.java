package com.api.service.controller;

import com.api.service.model.Experiencia;
import com.api.service.service.ExperienciaService;
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
public class ExperienciaController {
    
    @Autowired()
    ExperienciaService experienciaService;
    
    @CrossOrigin(origins = "*")
    @GetMapping("/experiencia/todos")
    public List<Experiencia> getExperiencia(){
        return experienciaService.getTodos();
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/experiencia/{idAspirante}")
    public List<Experiencia> getExperienciaByAspirante(@PathVariable Long idAspirante){
        return experienciaService.getExperienciaByAspirante(idAspirante);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/experiencia/crear")
    public String guardarExperiencia(@RequestBody Experiencia exp){
        experienciaService.guardarExperiencia (exp);
        return "Su experiencia fue guardada exitosamente";
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
    } 
    
    @CrossOrigin(origins = "*")
    @PutMapping("/experiencia/editar")
    public String editarExperiencia(@RequestBody Experiencia exp){
        experienciaService.editarExperiencia(exp);
        return "Se edito con exito la experiencia obtenida";
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/experiencia/editarlista")
    public void editarTodoExperiencia(@RequestBody List<Experiencia> listExperiencia){
        experienciaService.editarTodoExperiencia(listExperiencia);
    }
}
