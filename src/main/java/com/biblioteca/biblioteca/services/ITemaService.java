package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.models.Tema;

public interface ITemaService {
    
    List<Tema> getAllTemas();
    Tema createTema(Tema tema);
    Tema findTemaById(int temaId);
    boolean deleteTemaById(int temaId);
}
