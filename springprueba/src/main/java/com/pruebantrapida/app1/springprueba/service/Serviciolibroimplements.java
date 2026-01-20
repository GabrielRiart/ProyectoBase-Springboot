package com.pruebantrapida.app1.springprueba.service;

import com.pruebarapida.app1.springprueba.models.DTO.Libros;
import org.springframework.stereotype.Service;


@Service
public class Serviciolibroimplements implements serviciolibrointerface {
    @Override
    public Libros buscarUnlibro(String libro,Libros libri) {
        libri.setNameLibro(libro);
        if(libri.getNameLibro().equals("Pepito33")){
            libri.setDescripcion("Brillo muy bueno");
            libri.setDate(1900);//nose la verdad

        }else {
            libri.setNameLibro("Libro no encontrado");
            libri.setNameLibro(null);
            libri.setDescripcion(null);
        }

        return libri;
    }
@Override
    public String busqueda(String libro,Libros libri) {
        libri.setNameLibro(libro);
        if(libri.getNameLibro().equals("Pepito33")){
            return "El libro es muy bueno y esta en stock";
        }else {
            libri.setNameLibro("Libro no encontrado");
            return "El libro no se encuentra disponible";
        }
    }
}

