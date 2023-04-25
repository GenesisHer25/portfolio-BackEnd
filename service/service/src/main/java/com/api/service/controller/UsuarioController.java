package com.api.service.controller;


import com.api.service.model.Usuario;
import com.api.service.service.UsuarioService;
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
public class UsuarioController { 
    
    @Autowired()
    UsuarioService usuarioService;
    
    @GetMapping("/usuario/todos")
    public List<Usuario> getUsuario(){
        return usuarioService.getTodos();
    }
    
    @GetMapping("/usuario/{idAspirante}")
    public List<Usuario> getUsuarioByAspirante(@PathVariable Long idAspirante){
        return usuarioService.getUsuarioByAspirante(idAspirante);
    }
    
    @GetMapping("/usuario/autentication")
    public Usuario autentication(@RequestBody Usuario user){
        return usuarioService.Autentication(user);
    }
    
    @PostMapping("/usuario/crear")
    public String guardarUsuario(@RequestBody Usuario user){
        usuarioService.guardarUsuario (user);
        return "Se agrego con exito el usuario ingresado";
    }
    
    @DeleteMapping("/usuario/borrar/{id}")
    public String borrarUsuario(@PathVariable Long id){
        usuarioService.borrarUsuario(id);
        return "Se elimino el usuario seleccionado";
}
    @PutMapping("/usuario/editar/{id}")
    public String editarUsuario(@RequestBody Usuario user){
        usuarioService.editarUsuario(user);
        return "Se edito correctamente el usuario y contraseña";
    }   
 
}
 

