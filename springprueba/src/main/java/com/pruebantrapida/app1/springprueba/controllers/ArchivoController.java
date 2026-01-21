package com.pruebantrapida.app1.springprueba.controllers;

import com.pruebantrapida.app1.springprueba.service.FileContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/archivo")
public class ArchivoController {
    private final FileContent v_contenido;
    public ArchivoController(FileContent contendio){
        this.v_contenido=contendio;
    }
    @GetMapping("/lectura")
    public ResponseEntity<String> lectura (@RequestParam String ruta){
        try{
            String elarchivo= v_contenido.lecturaArchivo(ruta);
            return ResponseEntity.ok(elarchivo);
        }catch (RuntimeException ERROR){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error en lectura de archivo"+ ERROR);
        }
    }
}
