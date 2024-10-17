package com.biblioteca.biblioteca.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.dto.SocioDTO;
import com.biblioteca.biblioteca.models.Socio;
import com.biblioteca.biblioteca.repositories.EjemplarRepository;
import com.biblioteca.biblioteca.repositories.SocioRepository;
import com.biblioteca.biblioteca.services.ISocioService;

@Service
public class SocioService implements ISocioService{
    
    @Autowired
    private SocioRepository socioRepository;

    @Autowired
    private EjemplarRepository ejemplarRepository;

    @Override
    public List<Socio> getAllSocios() {
        return socioRepository.findAll();
    }

    @Override
    public Socio createSocio(SocioDTO socioDTO){

        Socio socio = socioDTO.getSocio();
        socio.setEjemplares(ejemplarRepository.findAllById(socioDTO.getListaIdEjemplares()));
        return socioRepository.save(socio);
    }

    @Override
    public Socio getSocioById(String socioId){
        /* Si el optional devuelve null salta excepcion, si no devuelve el socio con id socioId */
        return socioRepository.findById(socioId).orElseThrow(() -> new RuntimeException("Socio no encontrado con ID: "+ socioId));
    }

    @Override
    public boolean deleteSocioById(String socioId){
        try {
            socioRepository.deleteById(socioId);
            return true;
        } catch (Exception e) {
            System.out.println("Error en deleteIdiomaById: " + e);
            return false;
        }
    }
        
}
