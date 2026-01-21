package com.pruebantrapida.app1.springprueba.util;

import com.pruebarapida.app1.springprueba.models.DTO.Libros2;
import org.springframework.stereotype.Component;


@Component
public class ValidacionBroli {

    public boolean tituloValido(Libros2 libro) {
        return libro != null
                && libro.getTitulo() != null
                && !libro.getTitulo().isBlank();
    }
}
