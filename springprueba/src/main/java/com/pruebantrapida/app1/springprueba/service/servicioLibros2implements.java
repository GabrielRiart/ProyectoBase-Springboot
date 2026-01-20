package com.pruebantrapida.app1.springprueba.service;

import com.pruebantrapida.app1.springprueba.repolib.repoLibro2interface;
import com.pruebarapida.app1.springprueba.models.DTO.Libros2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class servicioLibros2implements implements servicioLibros2interface {
    private final repoLibro2interface i_Repo;
    public servicioLibros2implements(repoLibro2interface i_Repo){
        this.i_Repo=i_Repo;
    }

    @Override
    public List<Libros2> ObtenerTodos() {
        return i_Repo.findAll();
    }

    @Override
    public Optional<Libros2> obtenerPorid(long id) {
        return i_Repo.findByid(id);
    }

    @Override
    public Libros2 guardar(Libros2 libro) {
        return i_Repo.save(libro);
    }

    @Override
    public void eliminarPorid(long id) {
        i_Repo.deleteByid(id);
    }

    @Override
    public String buscarlibroPortitulo(String titulo) {
        boolean encontrado = i_Repo.findAll().stream()
                .anyMatch(libros2 -> libros2.getTitulo() !=null && libros2.getTitulo().equalsIgnoreCase(titulo));
        return encontrado ? "Libro encontrado ": "Libro no encontrado";
    }


}

