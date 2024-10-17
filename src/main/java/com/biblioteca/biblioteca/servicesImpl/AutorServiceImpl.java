package com.biblioteca.biblioteca.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Autor;
import com.biblioteca.biblioteca.repositories.AutorRepository;
import com.biblioteca.biblioteca.services.IAutorService;

@Service
public class AutorServiceImpl implements IAutorService{
    
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public List<Autor> getAllAutores(){
        try{
            return autorRepository.findAll();
        }catch(Exception e){
            System.out.println("Error al getAllAutors " + e);
            return null;
        }
        
    }

    @Override 
    public Autor createAutor(Autor autor){
        try {
          return autorRepository.save(autor);
        } catch (Exception e) {
            System.out.println("Error al crear Autor " + e);
            return null;
        }
    }

    @Override
    public Autor findAutorById(Integer autorId){
        return autorRepository.findById(autorId).orElseThrow(() -> new RuntimeException("Autor no encontrado con ID: "+ autorId));
    }
  
    @Override
    public  boolean deleteAutorById(Integer autorId){
        try {
            autorRepository.deleteById(autorId);
            return true;
        } catch (Exception e) {
            System.out.println("Error al crear Autor " + e);
            return false;
        } 
    }
}
