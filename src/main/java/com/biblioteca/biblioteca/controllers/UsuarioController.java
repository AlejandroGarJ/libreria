package com.biblioteca.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.models.Usuario;
import com.biblioteca.biblioteca.servicesImpl.UsuarioServiceImpl;

@RestController  
@RequestMapping("/usuario") 
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/create")  // Cambia la URL según sea necesario
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        System.out.println("Hola");
        return usuarioServiceImpl.createUsuario(usuario);
    }
}
