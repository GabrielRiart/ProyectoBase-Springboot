package com.pruebarapida.app1.springprueba.models.DTO;

public class Libros {
    private String nameLibro,descripcion;
    private int date;



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getNameLibro() {
        return nameLibro;
    }

    public void setNameLibro(String nameLibro) {
        this.nameLibro = nameLibro;
    }

}
