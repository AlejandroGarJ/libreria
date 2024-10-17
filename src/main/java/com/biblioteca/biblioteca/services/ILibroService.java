package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.models.Libro;

public interface ILibroService {
    
    List<Libro> getAllLibros();
    Libro getLibroById(int libroId);
    Libro saveLibro(Libro libro);
    void deleteLibroById(int libroId);

}
