package com.challengeCS.challengecs1.wrapper;

import com.challengeCS.challengecs1.model.DatosUser;

import java.util.ArrayList;
import java.util.List;

public class PuntoDosWrapper {
    private List<DatosUser> listaOrdenadaPorCodigo;
    private String ultimoNombre;
    private String primerDni;

    public PuntoDosWrapper(){
        this.listaOrdenadaPorCodigo = new ArrayList<>();
        this.ultimoNombre = new String();
        this.primerDni = new String();
    }

    public List<DatosUser> getListaOrdenadaPorCodigo() { return listaOrdenadaPorCodigo; }
    public void setListaOrdenadaPorCodigo(List<DatosUser> listaOrdenadaPorCodigo) { this.listaOrdenadaPorCodigo = listaOrdenadaPorCodigo;}

    public String getUltimoNombre() { return ultimoNombre;}

    public void setUltimoNombre(String ultimoNombre) {this.ultimoNombre = ultimoNombre; }

    public String getPrimerDni() { return primerDni = primerDni; }

    public void setPrimerDni(String primerDni) { this.primerDni = primerDni;}
}






