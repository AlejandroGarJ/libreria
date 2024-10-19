package com.biblioteca.biblioteca.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Usuario;
import com.biblioteca.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado con email: " + email);
        }
        return org.springframework.security.core.userdetails.User
        .withUsername(usuario.getEmail())
        .password(usuario.getPassword())
        .accountLocked(false) // Puedes ajustar esto según tus necesidades
        .accountExpired(false)
        .credentialsExpired(false)
        .disabled(false)
        .build();
}
    }
    

