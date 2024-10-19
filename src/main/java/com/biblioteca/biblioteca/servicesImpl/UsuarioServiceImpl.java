package com.biblioteca.biblioteca.servicesImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Usuario;
import com.biblioteca.biblioteca.repositories.UsuarioRepository;
import com.biblioteca.biblioteca.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Usuario createUsuario(Usuario usuario){
        String contrasenaCodificada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(contrasenaCodificada);
        return usuarioRepository.save(usuario);
    }

    public Usuario encontrarPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

}
