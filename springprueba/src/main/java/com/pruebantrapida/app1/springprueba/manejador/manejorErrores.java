package com.pruebantrapida.app1.springprueba.manejador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class manejorErrores {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleAritmeticException(ArithmeticException Error) {
        return new ResponseEntity<>("Error: Division por cero no permitida", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handNullPointerException(NullPointerException Error) {
        return new ResponseEntity<>("Error: No esta permitido con un null", HttpStatus.BAD_REQUEST);
    }

}
