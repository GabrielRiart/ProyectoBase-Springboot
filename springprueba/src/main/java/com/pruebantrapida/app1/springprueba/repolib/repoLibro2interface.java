package com.pruebantrapida.app1.springprueba.repolib;

import com.pruebarapida.app1.springprueba.models.DTO.Libros2;

import java.util.List;
import java.util.Optional;

public interface repoLibro2interface {
    List<Libros2> findAll();
    Optional<Libros2>findByid(long Id);
    Libros2 save(Libros2 Libro);
    void deleteByid(long id);
}
