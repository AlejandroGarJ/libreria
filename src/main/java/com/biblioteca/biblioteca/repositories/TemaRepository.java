package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {
   
}
