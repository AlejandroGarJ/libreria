package com.biblioteca.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.models.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, String> {
   
}
