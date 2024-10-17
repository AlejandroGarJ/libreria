package com.biblioteca.biblioteca.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.biblioteca.models.Autor;
import com.biblioteca.biblioteca.models.Libro;
import com.biblioteca.biblioteca.repositories.AutorRepository;
import com.biblioteca.biblioteca.repositories.LibroRepository;
import com.biblioteca.biblioteca.services.ILibroService;

@Service
public class LibroServiceImpl implements ILibroService {
    
    @Autowired
    private LibroRepository libroRepository;

    @Autowired 
    private AutorRepository autorRepository;


    @Override
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }
    
    @Override
    public Libro getLibroById(int libroId){

        try {
            return libroRepository.findById(libroId);
        }
        catch (Exception e) {
            System.out.println("Error en getLibroById: " + e);
            return null;
        }
    }

    @Override
    public Libro saveLibro(Libro libro) {
        try {

            for(Autor autor : libro.getAutores()){
                if(!autorRepository.existsById(autor.getId_autor())){
                    autorRepository.save(autor);
                }
            }
            
            /* return libroRepository.save(libro); */
            return libroRepository.save(libro);
        } catch (Exception e) {
            System.out.println("Error en saveLibr: " + e);
            return null;
        }
        
    }

    @Override
    public void deleteLibroById(int libroId){
        try {
            libroRepository.deleteById(libroId);
        } catch (Exception e) {
            System.out.println("Error en saveLibr: " + e);
        }
    }

    public AutorRepository getAutorRepository() {
        return autorRepository;
    }

    public void setAutorRepository(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }
}
