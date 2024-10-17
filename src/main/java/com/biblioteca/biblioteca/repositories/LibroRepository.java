package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
    
    Libro findById(int id_libro); 
}
