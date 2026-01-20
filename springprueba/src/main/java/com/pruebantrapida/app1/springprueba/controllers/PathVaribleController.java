package com.pruebantrapida.app1.springprueba.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebarapida.app1.springprueba.models.DTO.Empleados;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/Api/variable")
public class PathVaribleController {
@Value("${config.usuario}")
private String usuario;
@Value("${config.codigo}")
private String codigo;
@Value("${config.mensajes}")
private String mensajes;
@Value("${config.valores}")
private String[] valores;
@Value("${config.beta}")
private String beta;
@Value("${config.alpha}")
private String alpha;
@Value("${config.delta}")
private String delta;
@GetMapping("pagina1/{Mensajexs}")
public ParametroDto Pagina1(@PathVariable String Mensajexs){ {
    ParametroDto parametroxs = new ParametroDto();
    parametroxs.setInformacion(Mensajexs);
    return parametroxs;
        }
    }


@PostMapping("solicitar")
public Empleados crearempleado(@RequestBody Empleados Empleadovich ) {

    return Empleadovich;
}

@GetMapping("/valorante")
public Map<String, Object> obtenerValores(){
    Map<String, Object> json = new HashMap<>();
    json.put("usuario", usuario);
    json.put("codigo", codigo);
    json.put("mensajes", mensajes);
    json.put("valores", valores);
    json.put("valores", Arrays.asList(valores));
    json.put("beta", beta);
    json.put("alpha", alpha);
    json.put("delta", delta);
    return json;
    }

}