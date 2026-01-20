package com.pruebantrapida.app1.springprueba.service;

import com.pruebarapida.app1.springprueba.models.DTO.Libros2;

import java.util.List;
import java.util.Optional;

public interface servicioLibros2interface {
    List<Libros2> ObtenerTodos();
    Optional<Libros2> obtenerPorid(long id);
    Libros2 guardar(Libros2 libro);
    void eliminarPorid(long id);
    String buscarlibroPortitulo(String titulo);
}
