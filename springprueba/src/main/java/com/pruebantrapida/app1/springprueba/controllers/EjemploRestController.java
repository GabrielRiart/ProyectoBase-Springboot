package com.pruebantrapida.app1.springprueba.controllers;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebarapida.app1.springprueba.models.Empleados;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Api")
public class EjemploRestController {
    @GetMapping("/detalles_infoRest")
    public Map<String, Object> info(){
    Empleados Empleado1 = new Empleados("Gabriel", "Riart", "11 de septiembre", "Pasante", 21, 4444, 1);
    Map< String, Object> respuesta = new HashMap<>();
    respuesta.put("Empleado", Empleado1);
    respuesta.put("Informacion", "Es un bobazo");   
   
    return respuesta;
        }
    @GetMapping("/TaradoRest")
    public String Tarado(){
        return "TaradoRest";
    } 
        


}
