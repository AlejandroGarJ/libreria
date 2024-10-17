package com.biblioteca.biblioteca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.models.Ejemplar;
import com.biblioteca.biblioteca.servicesImpl.EjemplarServiceImpl;


@RestController  
@RequestMapping("/ejemplar") 
public class EjemplarController {
    
    @Autowired
    private EjemplarServiceImpl ejemplarService;

     @GetMapping("/getAll")  
    public List<Ejemplar> getAll() {
        return ejemplarService.getAllEjemplares();
    }

    @PostMapping("/create")  // Cambia la URL según sea necesario
    public Ejemplar createEjemplar(@RequestBody Ejemplar ejemplar) {
        return ejemplarService.createEjemplar(ejemplar);
    }

    @PostMapping("/findById")
    public Ejemplar findEjemplarById(@RequestBody Map<String, Integer> request) {
        return ejemplarService.findEjemplarById(request.get("id"));
    }

    @PostMapping("/deleteById")
    public String deleteEjemplarById(@RequestBody Map<String, Integer> request) {
        
        return ejemplarService.deleteEjemplarById(request.get("id")) ? "Se eliminó con éxito" : "No se pudo eliminar";
    }
}
