package com.biblioteca.biblioteca.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Tema;
import com.biblioteca.biblioteca.repositories.TemaRepository;
import com.biblioteca.biblioteca.services.ITemaService;

@Service
public class TemaService implements ITemaService{
    
    @Autowired
    private TemaRepository temaRepository;

    @Override
    public List<Tema> getAllTemas(){
        try{
            return temaRepository.findAll();
        }catch(Exception e){
            System.out.println("Error al getAllTemas " + e);
            return null;
        }
        
    }

    @Override 
    public Tema createTema(Tema tema){
        try {
            return temaRepository.save(tema);
        } catch (Exception e) {
            System.out.println("Error al crear tema " + e);
            return null;
        }
    }

    @Override
    public Tema findTemaById(int temaId){
        return temaRepository.findById(temaId).orElseThrow(() -> new RuntimeException("Tema no encontrado con ID: "+ temaId));
    }
  
    @Override
    public boolean deleteTemaById(int temaId){
        try {
            temaRepository.deleteById(temaId);
            return true;
        } catch (Exception e) {
            System.out.println("Error al crear tema " + e);
            return false;
        } 
    }
}
