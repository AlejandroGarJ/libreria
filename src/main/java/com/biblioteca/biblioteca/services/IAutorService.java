package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.models.Autor;

public interface IAutorService {
     List<Autor> getAllAutores();
    Autor createAutor(Autor autor);
    boolean deleteAutorById(Integer idAutor);
    Autor findAutorById(Integer idAutor);
}   


