package model;

import java.util.ArrayList;
import java.util.List;

public class ResponseResults {
    private List<String> nombresComLu;
    private int cantidadNombres;
    private List<String> nombresFinS;

    public ResponseResults (){
        this.nombresComLu = new ArrayList<>();
        this.cantidadNombres = 0;
        this.nombresFinS = new ArrayList<>();
    }

    public List<String> getNombresComLu() {
        return nombresComLu;
    }
    public int getCantidadNombres() {
        return cantidadNombres;
    }

    public void setCantidadNombres(int cantidadNombres) {
        this.cantidadNombres = cantidadNombres;
    }
    public void setNombresComLu(List<String> nombresComLu) {
        this.nombresComLu = nombresComLu;
    }


    public List<String> getNombresFinS() {
        return nombresFinS;
    }

    public void setNombresFinS(List<String> nombresFinS) {
        this.nombresFinS = nombresFinS;
    }

    public void addNombresLu (String nombre){
        this.nombresFinS.add(nombre);
    }
    public void addNombresFinS (String nombre){
        this.nombresFinS.add(nombre);
    }

}
