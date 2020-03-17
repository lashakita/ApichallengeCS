package com.challengeCS.challengecs1.wrapper;

import com.challengeCS.challengecs1.model.DatosUser;

import java.util.ArrayList;
import java.util.List;

public class PuntoDosWrapper {
    private List<DatosUser> datosDeUsuario;
    private String ultimoNombre;
    private String primerDni;

    public PuntoDosWrapper(){
        this.datosDeUsuario = new ArrayList<>();
        this.ultimoNombre = new String();
        this.primerDni = new String();
    }

    public List<DatosUser> getDatosDeUsuario() { return datosDeUsuario; }
    public void setDatosDeUsuario(List<DatosUser> datosDeUsuario) { this.datosDeUsuario = datosDeUsuario;}

    public String getUltimoNombre() { return ultimoNombre;}

    public void setUltimoNombre(String ultimoNombre) {this.ultimoNombre = ultimoNombre; }

    public String getPrimerDni() { return primerDni = datosDeUsuario.stream().findFirst().get().getDni(); }

    public void setPrimerDni(String primerDni) { this.primerDni = primerDni;}
}






