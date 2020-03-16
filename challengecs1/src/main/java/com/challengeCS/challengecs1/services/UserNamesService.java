package com.challengeCS.challengecs1.services;

import com.challengeCS.challengecs1.model.ResponseResults;
import com.challengeCS.challengecs1.model.UserName;
import org.springframework.stereotype.Service;
import com.challengeCS.challengecs1.persistence.UserNameStorage;

import java.util.List;


@Service
public class UserNamesService {

    //public UserNameStorage userNameStorage;
    //public List <UserName> usernameInputs;


   /* public UserNamesService (UserNameStorage userNameStorage){ this.userNameStorage  = userNameStorage;}
    public List<UserName> getUsernameInputs() {
        return usernameInputs;
    }*/

    /*public UserName addNameToList (UserName nuevoUserName){
        long count = usernameInputs.stream().count();
        int i=usernameInputs.stream().skip(count - 1).findFirst().get().getCodigo();
        nuevoUserName.setCodigo(i+1);
        getUsernameInputs().add(nuevoUserName);
        this.userNameStorage.agregarNuevoIngresoJS(usernameInputs);
        return nuevoUserName;

    }*/

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
