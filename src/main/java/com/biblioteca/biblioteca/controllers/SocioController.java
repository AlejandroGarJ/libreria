package com.biblioteca.biblioteca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.models.Socio;
import com.biblioteca.biblioteca.servicesImpl.SocioServiceImpl;

@RestController  
@RequestMapping("/socio") 
public class SocioController {
    
    @Autowired
    private SocioServiceImpl socioService;

    @GetMapping("/getAll")  
    public List<Socio> getAll() {
        return socioService.getAllSocios();
    }

    @PostMapping("/getById")
    public Socio getSocioById(@RequestBody Map<String, String> request) {
        return socioService.getSocioById(request.get("id"));
    }
    
    @PostMapping("/create")
    public Socio createSocio(@RequestBody Socio socio) {
        return socioService.createSocio(socio);
    }

    @PostMapping("/deleteById")
    public String deleteIdiomaById(@RequestBody Map<String, String> request) {
        
        return socioService.deleteSocioById(request.get("id")) ? "Se eliminó con éxito" : "No se pudo eliminar";
    }
   
}
