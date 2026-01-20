package com.pruebantrapida.app1.springprueba.controllers;

import com.pruebantrapida.app1.springprueba.repolib.Repolibros;
import com.pruebantrapida.app1.springprueba.service.Serviciolibroimplements;
import com.pruebantrapida.app1.springprueba.service.servicioLibros2implements;
import com.pruebantrapida.app1.springprueba.service.servicioLibros2interface;
import com.pruebarapida.app1.springprueba.models.DTO.Libros;
import com.pruebarapida.app1.springprueba.models.DTO.Libros2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibreriaRestcontroller {
    private final Serviciolibroimplements serviciolibroimplements;
    private final Repolibros repolibros;
    private final servicioLibros2interface nuevoservicio;
    private final servicioLibros2implements poronga;
    public LibreriaRestcontroller(Serviciolibroimplements serviciolibroimplements, Repolibros repolibros,servicioLibros2interface nuevoservicio,servicioLibros2implements poronga) {
        this.serviciolibroimplements = serviciolibroimplements;
        this.repolibros = repolibros;
        this.nuevoservicio = nuevoservicio;
        this.poronga=poronga;
    }

    @GetMapping("/busquedalibro/{libro}")
    public Libros busqueda(@PathVariable String libro) {
        Libros libri= new Libros();
        return serviciolibroimplements.buscarUnlibro(libro,libri);
    }
    @GetMapping("/busqueda/{libro}")
    public String busquedad(@PathVariable String libro){
        Libros libri= new Libros();
        return serviciolibroimplements.busqueda(libro,libri);
    }
    @GetMapping("/Todosloslibros")
    public List<Libros2> todosLibros(){
        return repolibros.findAll();
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Libros2> encontrarlibro(@PathVariable long id){
        return repolibros.findByid(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/busk/{id}")
    public ResponseEntity<Libros2> encontrado(@PathVariable long id){
        Optional<Libros2> libroxx= nuevoservicio.obtenerPorid(id);
        return libroxx.map(ResponseEntity::ok).orElseGet(()->
                ResponseEntity.notFound().build());
    }
    @PostMapping("/listar")
    public ResponseEntity<Libros2> crear(@RequestBody Libros2 libro){
        nuevoservicio.guardar(libro);
        return ResponseEntity.ok(libro);



    }
}
