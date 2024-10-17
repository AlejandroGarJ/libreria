package com.biblioteca.biblioteca.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Idioma;
import com.biblioteca.biblioteca.repositories.IdiomaRepository;
import com.biblioteca.biblioteca.services.IIdiomaService;

@Service
public class IdiomaService implements IIdiomaService{
    
    @Autowired
    private IdiomaRepository idiomaRepository;

    @Override
    public List<Idioma> getAll(){
        return idiomaRepository.findAll();
    }

    @Override
    public Idioma createIdioma(Idioma idioma){
        return idiomaRepository.save(idioma);
    }

    @Override
    public Idioma findIdiomaById(int idiomaId){
        return idiomaRepository.findById(idiomaId).orElseThrow(() -> new RuntimeException("Idioma no encontrado con ID: "+ idiomaId));
    }

    @Override
    public boolean  deleteIdiomaById(int idiomaId){
        try {
            idiomaRepository.deleteById(idiomaId);
            return true;
        } catch (Exception e) {
            System.out.println("Error en deleteIdiomaById: " + e);
            return false;
        }
    }
}
