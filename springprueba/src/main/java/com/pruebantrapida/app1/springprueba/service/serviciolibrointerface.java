package com.pruebantrapida.app1.springprueba.service;
import com.pruebarapida.app1.springprueba.models.DTO.Libros;
public interface serviciolibrointerface {
    Libros buscarUnlibro(String libro, Libros libri);
    //String listarlibros();
    String busqueda(String libro,Libros libri);
}
