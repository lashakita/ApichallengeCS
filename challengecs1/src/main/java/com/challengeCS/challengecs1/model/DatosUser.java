package com.challengeCS.challengecs1.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class DatosUser implements Serializable {

    @Id
    private int  codigo;
    private String dni;
    private String nombre;
    private String apellido;

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
