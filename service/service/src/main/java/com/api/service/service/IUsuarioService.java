package com.api.service.service;

import com.api.service.model.Usuario;
import java.util.List;


interface IUsuarioService {
    
    public List<Usuario> getTodos();
    
    public List<Usuario> getUsuarioByAspirante(Long idAspirante);
    
    public Usuario Autentication(Usuario usuario);
    
    public void guardarUsuario(Usuario user);
    
    public void borrarUsuario(Long id);
    
    public void editarUsuario(Usuario user);
         

}
