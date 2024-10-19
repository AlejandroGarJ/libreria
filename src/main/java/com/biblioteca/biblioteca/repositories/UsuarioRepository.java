package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
   
    Usuario findByEmail(String email);
}
