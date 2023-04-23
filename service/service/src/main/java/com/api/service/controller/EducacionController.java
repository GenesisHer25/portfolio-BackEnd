package com.api.service.controller;

import com.api.service.service.EducacionService;
import com.api.service.model.Educacion;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EducacionController {
    
    @Autowired()
    EducacionService educacionService;
    
    @GetMapping("/educacion/consulta/todo")
    public List<Educacion> consultaEducacion(){
            return educacionService.buscarTodos();
     }
    
    @PostMapping("/educacion/crear")
    public String guardarEducacion(@RequestBody Educacion edu){
        educacionService.guardarEducacion (edu);
        return "Su registro de educacion cursada fue agregado correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
        return "La educacion cursada fue eliminada correctamente";
}
    @PutMapping("educacion/editar/{id}")
    public Educacion editaEducacion(@PathVariable Long id,
                                   @RequestParam ("tituloEstudiado") String nuevoTituloEstudiado,
                                   @RequestParam ("nombreInstituto") String nuevoNombreInstituto,
                                   @RequestParam ("logoInstituto") String nuevologoInstituto,
                                   @RequestParam ("fechaInicio") Date nuevafechaInicio,
                                   @RequestParam ("fechaFin") Date nuevafechaFin) {
        Educacion edu = educacionService.buscaEducacion(id);
        edu.setTituloEstudiado(nuevoTituloEstudiado);
        edu.setNombreInstituto(nuevoNombreInstituto);
        edu.setLogoInstituto(nuevologoInstituto);
        edu.setFechaInicio(nuevafechaInicio);
        edu.setFechaFin(nuevafechaFin);
        educacionService.guardarEducacion(edu);
        return edu;
    }
}
   
