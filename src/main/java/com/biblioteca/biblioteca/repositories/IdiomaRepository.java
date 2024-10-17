package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Idioma;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Integer> {
   
}
