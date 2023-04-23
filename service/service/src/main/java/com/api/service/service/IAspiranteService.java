package com.api.service.service;

import com.api.service.model.Aspirante;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public interface IAspiranteService {
    
    public List<Aspirante> getTodos();
    
    public void guardarAspirante(Aspirante aspi);
    
    public void borrarAspirante(Long id);
    
    public Aspirante buscarAspirante(Long id);
            
}
