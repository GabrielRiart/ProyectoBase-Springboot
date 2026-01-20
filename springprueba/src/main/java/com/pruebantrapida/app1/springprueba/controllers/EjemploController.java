package com.pruebantrapida.app1.springprueba.controllers;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pruebarapida.app1.springprueba.models.DTO.Empleados;



@Controller
public class EjemploController {
    @GetMapping("/detalles_info")
    public String info(Model model){
    Empleados Empleado1=new Empleados("Gabriel", "Riart", "Fernando de la mora", "Pasante", 21, 44, 1);     
    model.addAttribute("Empleadinho", Empleado1);
    model.addAttribute("Informacion", "Este tipo es un bobazo");
        return "detalles_info"; 

        }

    @ModelAttribute("Empleadinho1")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList( 
          new Empleados("María", "Perez", "Calle segunda no.2",
          "Secretaria", 20, 123654987, 02),
          new Empleados("María", "Perez", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
          new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
          new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
          new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
          new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05)
         
       );
    }
    @GetMapping("/Tarado")
    public String Tarado(){
        return "Tarado";
    } 
        


}
