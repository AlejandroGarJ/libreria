package com.biblioteca.biblioteca.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Socio {
    
    @Id
    /* No funciona la validacion de size */
    private String dni;

    @Column
    private String nombre;

    @Column
    private String domicilio;

    @Column
    private String telefono;

    /* Relación Ejemplares */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
        name = "ejemplar_socio", joinColumns=@JoinColumn(name = "dni", referencedColumnName = "dni"),
        inverseJoinColumns= @JoinColumn(name = "id_ejemplar", referencedColumnName = "id_ejemplar")
    )
    private List<Ejemplar> ejemplares;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    

   
}
