package com.pruebantrapida.app1.springprueba.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String Divide(@RequestParam String numero, @RequestParam String numero2){
        try{
            int valor= Integer.parseInt(numero);
            int valor2= Integer.parseInt(numero2);
            int resutlado = valor/valor2;
            return "Resultado es " + resutlado ;

        } catch (NumberFormatException ERROR) {
            return "Error: el valor ingresado ('"+numero+" o "+numero2+"') no es un numero";
        }catch (ArithmeticException ERROR){
            return  "Error: No se puede dividir entre 0";
        }

    }
    @GetMapping("/null")
    public int nulo(){
        String valorNulo = null;
        return valorNulo.length();
    }
}



