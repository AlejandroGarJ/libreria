package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Ejemplar;

@Repository
public interface EjemplarRepository extends JpaRepository<Ejemplar, Integer> {
   
}
