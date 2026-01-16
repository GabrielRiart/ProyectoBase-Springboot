package com.pruebantrapida.app1.springprueba.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebarapida.app1.springprueba.models.DTO.ClaseDto;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Api")
public class EjemploRestController {
    @GetMapping("/detalles_infoRest")
    public ClaseDto info(){
        ClaseDto Usuario = new ClaseDto();
        Usuario.setTitulo("Bobazo");
        Usuario.setUsuario("GABRIEL");
    return Usuario ;
        }
    @GetMapping("/TaradoRest")
    public String Tarado(){
        return "TaradoRest";
    } 
        


}
