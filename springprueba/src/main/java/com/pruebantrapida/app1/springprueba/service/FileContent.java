package com.pruebantrapida.app1.springprueba.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileContent {
    public String lecturaArchivo(String ruta){
        try {
           Path v_ruta= Paths.get(ruta);
            return Files.readString(v_ruta);
        } catch (IOException ERROR) {
            throw new RuntimeException("Error de lectura de archivo"
                    + ERROR.getMessage(), ERROR);
        }


    }
}
