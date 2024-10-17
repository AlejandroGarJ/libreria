package com.biblioteca.biblioteca.dto;

import java.util.List;

import com.biblioteca.biblioteca.models.Socio;

public class SocioDTO {
    
    private Socio socio;
    private List<Integer> listaIdEjemplares;

    public Socio getSocio() {
        return socio;
    }

    public SocioDTO(){

    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public List<Integer> getListaIdEjemplares() {
        return listaIdEjemplares;
    }

    public void setListaIdEjemplares(List<Integer> listaIdEjemplares) {
        this.listaIdEjemplares = listaIdEjemplares;
    }


    
}
