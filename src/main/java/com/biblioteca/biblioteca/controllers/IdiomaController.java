package com.biblioteca.biblioteca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.models.Idioma;
import com.biblioteca.biblioteca.servicesImpl.IdiomaService;

@RestController  
@RequestMapping("/idioma") 
public class IdiomaController {

    @Autowired
    private IdiomaService idiomaService;

     @GetMapping("/getAll")  
    public List<Idioma> getAll() {
        return idiomaService.getAll();
    }

    @PostMapping("/create")  // Cambia la URL según sea necesario
    public Idioma createIdioma(@RequestBody Idioma idioma) {
        return idiomaService.createIdioma(idioma);
    }

    @PostMapping("/findById")
    public Idioma findIdiomaById(@RequestBody Map<String, Integer> request) {
        return idiomaService.findIdiomaById(request.get("id"));
    }

    @PostMapping("/deleteById")
    public String deleteIdiomaById(@RequestBody Map<String, Integer> request) {
        
        return idiomaService.deleteIdiomaById(request.get("id")) ? "Se eliminó con éxito" : "No se pudo eliminar";
    }
    
}
