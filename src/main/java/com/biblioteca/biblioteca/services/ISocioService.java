package com.biblioteca.biblioteca.services;

import java.util.List;

import com.biblioteca.biblioteca.dto.SocioDTO;
import com.biblioteca.biblioteca.models.Socio;

public interface ISocioService {

    List<Socio> getAllSocios();
    Socio createSocio(SocioDTO socioDTO);
    Socio getSocioById(String socioId);
    boolean deleteSocioById(String socioId);
}