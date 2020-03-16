package com.challengeCS.challengecs1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DatosUser implements Serializable {

    private String nombre;
    private String apellido;
    private int codigo;
    private String dni;

    public DatosUser() {}

    public DatosUser(String nombre, String apellido, int codigo, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.dni = dni;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
