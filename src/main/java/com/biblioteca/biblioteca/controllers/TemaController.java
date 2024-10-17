package com.biblioteca.biblioteca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.models.Tema;
import com.biblioteca.biblioteca.servicesImpl.TemaServiceImpl;


@RestController  
@RequestMapping("/tema") 
public class TemaController {
    
    @Autowired
    private TemaServiceImpl temaService;

     @GetMapping("/getAll")  
    public List<Tema> getAll() {
        return temaService.getAllTemas();
    }

    @PostMapping("/create")  // Cambia la URL según sea necesario
    public Tema createTema(@RequestBody Tema Tema) {
        return temaService.createTema(Tema);
    }

    @PostMapping("/findById")
    public Tema findTemaById(@RequestBody Map<String, Integer> request) {
        return temaService.findTemaById(request.get("id"));
    }

    @PostMapping("/deleteById")
    public String deleteTemaById(@RequestBody Map<String, Integer> request) {
        
        return temaService.deleteTemaById(request.get("id")) ? "Se eliminó con éxito" : "No se pudo eliminar";
    }
}
