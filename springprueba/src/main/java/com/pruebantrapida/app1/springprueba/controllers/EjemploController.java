package com.pruebantrapida.app1.springprueba.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pruebarapida.app1.springprueba.models.Empleados;



@Controller
public class EjemploController {
    @GetMapping("/detalles_info")
    public String info(Model model){
    Empleados Empleado1=new Empleados("Gabriel", "Riart", "Fernando de la mora", "Pasante", 21, 44, 1);     
    model.addAttribute("Empleadinho", Empleado1);
    model.addAttribute("Informacion", "Este tipo es un bobazo");
        return "detalles_info";
        }
    @GetMapping("/Tarado")
    public String Tarado(){
        return "Tarado";
    } 
        


}
