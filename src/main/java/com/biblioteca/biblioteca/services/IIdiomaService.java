package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.models.Idioma;

public interface IIdiomaService {
    
    List<Idioma> getAll();
    Idioma createIdioma(Idioma idioma);
    boolean deleteIdiomaById(int idIdioma);
    Idioma findIdiomaById(int idIdioma);
}
