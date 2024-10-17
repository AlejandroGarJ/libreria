package com.biblioteca.biblioteca.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Ejemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ejemplar;

     @ManyToOne(fetch = FetchType.EAGER)  // Cambiar a EAGER
    @JoinColumn(name = "id_libro")
    @JsonIgnoreProperties("ejemplares")
    private Libro libro;

        /* Relacion Socios */
   @ManyToMany(mappedBy="ejemplares")
   @JsonIgnoreProperties("ejemplares")
   private List<Socio> socios;


    // Getters y Setters

    public Long getId_ejemplar() {
        return id_ejemplar;
    }

    public void setId_ejemplar(Long id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

}
