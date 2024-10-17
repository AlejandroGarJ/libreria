package com.biblioteca.biblioteca.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Ejemplar;
import com.biblioteca.biblioteca.repositories.EjemplarRepository;
import com.biblioteca.biblioteca.repositories.LibroRepository;
import com.biblioteca.biblioteca.services.IEjemplarService;

@Service
public class EjemplarServiceImpl implements IEjemplarService{
    
    @Autowired
    private EjemplarRepository ejemplarRepository;

    @Autowired 
    private LibroRepository libroRepository;

    @Override
    public List<Ejemplar> getAllEjemplares(){
        try{
            return ejemplarRepository.findAll();
        }catch(Exception e){
            System.out.println("Error al getAllEjemplars " + e);
            return null;
        }
        
    }

    @Override 
    public Ejemplar createEjemplar(Ejemplar ejemplar){
        try {
            return ejemplarRepository.save(ejemplar);
        } catch (Exception e) {
            System.out.println("Error al crear Ejemplar " + e);
            return null;
        }
    }

    @Override
    public Ejemplar findEjemplarById(int ejemplarId){
        return ejemplarRepository.findById(ejemplarId).orElseThrow(() -> new RuntimeException("Ejemplar no encontrado con ID: "+ ejemplarId));
    }
  
    @Override
    public boolean deleteEjemplarById(int ejemplarId){
        try {
            ejemplarRepository.deleteById(ejemplarId);
            return true;
        } catch (Exception e) {
            System.out.println("Error al crear Ejemplar " + e);
            return false;
        } 
    }
}
