package com.api.service.service;

import com.api.service.model.Aspirante;
import com.api.service.repository.AspiranteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class AspiranteService  implements IAspiranteService{

    @Autowired()
    AspiranteRepository aspiranteRepository;
    
    
    @Override
    public List<Aspirante> getTodos() {
       
        return  aspiranteRepository.findAll();
    }
    
    @Override
    public Aspirante buscarAspirante(Long id) {
        Aspirante aspi = aspiranteRepository.findById(id).orElse(null);
        return aspi;
    }

   
    @Override
    public void guardarAspirante(Aspirante aspi) {
        
        aspiranteRepository.save(aspi);
    }

    @Override
    public void borrarAspirante(Long id) {
        
        aspiranteRepository.deleteById(id);
        
    }
    
    @Override
    public void editarAspirante(Aspirante aspi) {
        
        aspiranteRepository.save(aspi);
        
    }

    
}
