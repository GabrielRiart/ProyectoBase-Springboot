package com.pruebantrapida.app1.springprueba.repolib;

import com.pruebarapida.app1.springprueba.models.DTO.Libros;
import com.pruebarapida.app1.springprueba.models.DTO.Libros2;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class Repolibros implements repoLibro2interface{
    private final List<Libros2> libros= new ArrayList<>();
    public Repolibros (){
        libros.add(new Libros2(1L,"Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16)));
        libros.add(new Libros2(2L, "Gabriel García Márquez", "Cien Años de Soledad", LocalDate.of(1967, 5, 30)));
        libros.add(new Libros2(3L, "J.K. Rowling", "Harry Potter y la Piedra Filosofal", LocalDate.of(1997, 6, 26)));
        libros.add(new Libros2(4L, "George Orwell", "1984", LocalDate.of(1949, 6, 8)));
        libros.add(new Libros2(5L, "F. Scott Fitzgerald", "El Gran Gatsby", LocalDate.of(1925, 4, 10)));
    }
    @Override
    public List<Libros2> findAll(){
        return libros;
    }


    public Optional<Libros2>findByid(long idLibro){
     return libros.stream()
             .filter(libros2 -> libros2.getIdlibro()==idLibro)
             .findFirst();
    }


    @Override
    public Libros2 save(Libros2 Libro) {
        findByid(Libro.getIdlibro()).ifPresent(libros::remove);
        libros.add(Libro);
        return  Libro;
    }

    @Override
    public void deleteByid(long id) {
        findByid(id).ifPresent(libros::remove);
    }
}
