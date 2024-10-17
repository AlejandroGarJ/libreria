package com.biblioteca.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.models.Libro;
import com.biblioteca.biblioteca.servicesImpl.LibroServiceImpl;


@RestController  
@RequestMapping("/libro")  
public class LibroController {
    
    @Autowired
    private LibroServiceImpl libroService;

    @GetMapping("/getAll")  
    public List<Libro> decirHola() {
        return libroService.getAllLibros();
    }

    @GetMapping("/{id}")  // Endpoint para buscar un libro por ID
    public Libro getLibroById(@PathVariable("id") int libroId) {
        return libroService.getLibroById(libroId);
    }

    @PostMapping("/create")  // Cambia la URL según sea necesario
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @PostMapping("/delete")  
    public String delete(@RequestBody int id) {
        libroService.deleteLibroById(id);
        return "Libro con ID: " + id + " eliminado con éxito";
    }
}   