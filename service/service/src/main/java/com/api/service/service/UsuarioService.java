package com.api.service.service;


import com.api.service.model.Usuario;
import com.api.service.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService { 

    @Autowired()
    UsuarioRepository usuarioRepository;
    
    
    @Override
    public List<Usuario> getTodos() {
        
        return usuarioRepository.findAll();    
    }
    
    @Override
    public List<Usuario> getUsuarioByAspirante(Long idAspirante) {
       
        return usuarioRepository.findByIdAspirante(idAspirante); 
    }
    
    @Override
    public Usuario Autentication(Usuario usuario) {
    
     Usuario user = usuarioRepository.findByUsernameAndPassword(usuario.getUsername(),usuario.getPassword());
     return user;
    }

    @Override
    public void guardarUsuario(Usuario user) {
    
         usuarioRepository.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
        
        usuarioRepository.deleteById(id); 
    }

    @Override
    public void editarUsuario(Usuario user) {
    
        usuarioRepository.save(user);
    }

}