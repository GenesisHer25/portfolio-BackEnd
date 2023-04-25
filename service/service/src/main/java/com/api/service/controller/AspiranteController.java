package com.api.service.controller;

import com.api.service.model.Aspirante;
import com.api.service.service.AspiranteService;
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
public class AspiranteController {
    
    @Autowired()
    AspiranteService aspiranteService;
    
    @GetMapping("/aspirante/todos")
    public List<Aspirante> getAspirante(){
            return aspiranteService.getTodos();
    }
    
    @PostMapping("/aspirante/crear")
    public String guardarAspirante(@RequestBody Aspirante aspi){
        aspiranteService.guardarAspirante (aspi);
        return "Se agrego correctamente el aspirante";
    }
    
    @DeleteMapping("/aspirante/borrar/{id}")
    public String borrarAspirante(@PathVariable Long id){
        aspiranteService.borrarAspirante(id);
        return "Se elimino correctamente el aspirante";
    }     
 
    @PutMapping("/aspirante/editar")
    public String editarAspirante(@RequestBody Aspirante aspi){
        aspiranteService.editarAspirante (aspi);
        return "Se edito con exito el aspirante";
    }
}
 
