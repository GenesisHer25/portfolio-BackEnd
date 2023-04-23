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
import org.springframework.web.bind.annotation.RequestParam;
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
        return "El aspirante fue agregado correctamente";
    }
    
    @DeleteMapping("/aspirante/borrar/{id}")
    public String borrarAspirante(@PathVariable Long id){
        aspiranteService.borrarAspirante(id);
        return "La persona fue eliminada correctamente";
}
    @PutMapping("aspirante/editar/{id}")
    public Aspirante editarAspirante(@PathVariable Long id,
                                     @RequestParam ("nombre") String nuevoNombre,
                                     @RequestParam ("cargo") String nuevoCargo,
                                     @RequestParam ("descripcion") String nuevaDesc,
                                     @RequestParam ("foto") String nuevaFoto) {
        Aspirante aspi = aspiranteService.buscarAspirante(id);
        if (nuevoNombre != "");
        aspi.setNombre(nuevoNombre);
        if (nuevoCargo != "");
        aspi.setCargo(nuevoCargo);
        if (nuevaDesc != "");
        aspi.setDescripcion(nuevaFoto);
        if (nuevaFoto != "");
        aspi.setFoto(nuevaFoto);
        aspiranteService.guardarAspirante(aspi);
        return aspi;
    }
}
 
