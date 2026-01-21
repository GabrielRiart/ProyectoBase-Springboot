package com.pruebantrapida.app1.springprueba.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String Divide(){
        int valor = 20/0;
        return "Resultado es " + valor ;
    }
}
