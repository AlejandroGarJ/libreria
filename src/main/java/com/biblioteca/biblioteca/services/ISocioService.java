package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.models.Socio;

public interface ISocioService {

    List<Socio> getAllSocios();
    Socio createSocio(Socio socio);
    Socio getSocioById(String socioId);
    boolean deleteSocioById(String socioId);
}