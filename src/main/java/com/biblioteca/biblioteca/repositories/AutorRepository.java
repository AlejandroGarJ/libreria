package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
   
}
