package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.models.Ejemplar;

public interface IEjemplarService {
     List<Ejemplar> getAllEjemplares();
    Ejemplar createEjemplar(Ejemplar ejemplar);
    boolean deleteEjemplarById(int idEjemplar);
    Ejemplar findEjemplarById(int idEjemplar);
}   


