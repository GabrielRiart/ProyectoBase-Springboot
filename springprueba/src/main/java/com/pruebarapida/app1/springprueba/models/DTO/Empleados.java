package com.pruebarapida.app1.springprueba.models.DTO;

public class Empleados {
    private String nombre, apellido, direciones, puesto;
    private Integer edad,numero,id;
    public Empleados (String nombre,String apellido, String direciones, String puesto,Integer edad, Integer numero, Integer id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direciones=direciones;
        this.edad=edad;
        this.id=id;
        this.numero=numero;
        this.puesto=puesto;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireciones() {
        return direciones;
    }
    public void setDireciones(String direciones) {
        this.direciones = direciones;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
