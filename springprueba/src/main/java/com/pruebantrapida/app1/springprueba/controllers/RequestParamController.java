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
        parametro1.setInformacion(manolo);
        //No se puede devolver mas de un objeto en un request param almenos asi no 
        ParametroDto parametro2 = new ParametroDto();
        parametro2.setInformacion("OTRO VALOR");
        return parametro1;
    }
    @GetMapping("/Nosepuede")//Queria ver si se podia visualizar mas de un objeto con el requestparam pero nope
    public ClaseDto info(){
        ClaseDto Usuario = new ClaseDto();
        Usuario.setTitulo("Bobazo");
        Usuario.setUsuario("GABRIEL");
    return Usuario ;
        }
    
}
