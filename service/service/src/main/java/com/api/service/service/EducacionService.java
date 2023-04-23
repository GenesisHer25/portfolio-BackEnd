package com.api.service.service;

import com.api.service.model.Educacion;
import com.api.service.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired()
    EducacionRepository educacionRepository;
    
    
    @Override
    public List<Educacion> consultaEducacion() {
        
        return educacionRepository.findAll();
    }
    
    public void guardarEducacion(@RequestBody Educacion edu) {
        
    }

    public List<Educacion> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void borrarEducacion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Educacion buscaEducacion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  

    
}
