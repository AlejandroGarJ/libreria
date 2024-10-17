package com.biblioteca.biblioteca.dto;

import java.util.List;

import com.biblioteca.biblioteca.models.Autor;

public class AutorDTO {
    
    private Autor autor;
    private List<Integer> listaIdLibros;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Integer> getListaIdLibros() {
        return listaIdLibros;
    }

    public void setListaIdLibros(List<Integer> listaIdLibros) {
        this.listaIdLibros = listaIdLibros;
    }
    
}
