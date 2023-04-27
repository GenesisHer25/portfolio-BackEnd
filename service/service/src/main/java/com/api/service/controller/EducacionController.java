package com.api.service.controller;


import com.api.service.service.EducacionService;
import com.api.service.model.Educacion;
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
public class EducacionController {
    
    @Autowired()
    EducacionService educacionService;
    
    
    @CrossOrigin(origins = "*")
    @GetMapping("/educacion/todos")
    public List<Educacion> getEducacion(){
        return educacionService.getTodos();
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/educacion/{idAspirante}")
    public List<Educacion> getEducacionByAspirante(@PathVariable Long idAspirante){
            return educacionService.getEducacionByAspirante(idAspirante);
     }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/educacion/crear")
    public String guardarEducacion(@RequestBody Educacion edu){
        educacionService.guardarEducacion (edu);
        return "Se agrego correctamente la educacion cursada ";
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/educacion/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
        return "Se elimino correctamente la educacion cursada";
    }
    
    @CrossOrigin(origins = "*")
    @PutMapping("/educacion/editar")
    public String editarEducacion(@RequestBody Educacion edu){
        educacionService.editarEduacion(edu);
        return "Se edito con exito la educacion cursada";
    }
    
}