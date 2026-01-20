package com.pruebarapida.app1.springprueba.models.DTO;

import java.time.LocalDate;

public class Libros2 {
    private long idlibro;
    private String autor;
    private String titulo;
    private LocalDate fechaPublicacion;

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutor(String autor) {
        autor = autor;
    }

    public long getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(long idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libros2(long idlibro, String autor, String titulo, LocalDate fechaPublicacion){
        this.autor=autor;
        this.idlibro=idlibro;
        this.fechaPublicacion=fechaPublicacion;
        this.titulo=titulo;

    }
}
