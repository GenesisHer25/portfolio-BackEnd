package com.api.service.service;

import com.api.service.model.Aspirante;
import java.util.List;


public interface IAspiranteService {
    
    public List<Aspirante> getTodos();
    
    public void guardarAspirante(Aspirante aspi);
    
    public void borrarAspirante(Long id);
    
    public void editarAspirante(Aspirante aspi);
    
    public Aspirante buscarAspirante(Long id);
               
}
