package com.challengeCS.challengecs1.services;

import com.challengeCS.challengecs1.model.ResponseResults;
import com.challengeCS.challengecs1.model.DatosUser;
import org.springframework.stereotype.Service;
import com.challengeCS.challengecs1.persistence.DatosUserStorage;

import java.util.List;


@Service
public class UserNamesService {

    //devolucion de nombres del punto 1 y contabilizacion de cant de los mismos.
    public ResponseResults outputJson (List<String> nombresinput) {
        ResponseResults res = new ResponseResults();
        for (String nombre : nombresinput) {
            if (nombre.startsWith("LU")) {
                res.addNombresLu(nombre);
            }
            if (nombre.endsWith("S")){
                res.addNombresFinS(nombre);
            }
        }
        int cantidadEntradasNombresinput = nombresinput.size();
        res.setCantidadNombres(cantidadEntradasNombresinput);
        return res;
    }


}
