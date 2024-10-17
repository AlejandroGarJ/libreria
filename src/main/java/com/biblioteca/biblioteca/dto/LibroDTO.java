package com.biblioteca.biblioteca.dto;

import java.util.List;

import com.biblioteca.biblioteca.models.Libro;

public class LibroDTO {
    
    private Libro libro;
    private List<Integer> listaIdTemas;
    private List<Integer> listaIdAutores;
    
    public LibroDTO(Libro libro, List<Integer> listaIdTemas) {
        this.libro = libro;
        this.listaIdTemas = listaIdTemas;
    }



    public Libro getLibro() {
        return libro;
    }
    public LibroDTO() {
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Integer>  getListaIdTemas() {
        return listaIdTemas;
    }

    public void setListaIdTemas(List<Integer>  listaIdTemas) {
        this.listaIdTemas = listaIdTemas;
    }

    public List<Integer> getListaIdAutores() {
        return listaIdAutores;
    }

    public void setListaIdAutores(List<Integer> listaIdAutores) {
        this.listaIdAutores = listaIdAutores;
    }


}
