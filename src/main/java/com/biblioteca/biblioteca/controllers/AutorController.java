package com.biblioteca.biblioteca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.dto.AutorDTO;
import com.biblioteca.biblioteca.models.Autor;
import com.biblioteca.biblioteca.servicesImpl.AutorService;


@RestController  
@RequestMapping("/autor") 
public class AutorController {
    
    @Autowired
    private AutorService autorService;

     @GetMapping("/getAll")  
    public List<Autor> getAll() {
        return autorService.getAllAutores();
    }

     @PostMapping("/create")  // Cambia la URL según sea necesario
    public Autor createAutor(@RequestBody Autor autor) {
        return autorService.createAutor(autor);
    } 

    @PostMapping("/findById")
    public Autor findAutorById(@RequestBody Map<String, Integer> request) {
        return (Autor) autorService.findAutorById(request.get("id"));
    }

    @PostMapping("/deleteById")
    public String deleteAutorById(@RequestBody Map<String, Integer> request) {
        
        return autorService.deleteAutorById(request.get("id")) ? "Se eliminó con éxito" : "No se pudo eliminar";
    }
}
