package com.pruebantrapida.app1.springprueba.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.pruebarapida.app1.springprueba.models.DTO.ClaseDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/Api/Parametros")
public class RequestParamController {
    @GetMapping("/detalle")
    public ParametroDto detalle(@RequestParam(required = false, defaultValue = "SOS TERRIBLE TROL") String manolo) {
        ParametroDto parametro1 = new ParametroDto();
        parametro1.setManolo(manolo);
        return parametro1;
    }
    @GetMapping("/Nosepuede")
    public ClaseDto info(){
        ClaseDto Usuario = new ClaseDto();
        Usuario.setTitulo("Bobazo");
        Usuario.setUsuario("GABRIEL");
    return Usuario ;
        }
    
}
