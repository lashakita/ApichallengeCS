package com.challengeCS.challengecs1.services;

import com.challengeCS.challengecs1.model.DatosUser;
import com.challengeCS.challengecs1.persistence.DatosUserStorage;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DatosUserSerivce {

    //punto 2
    public DatosUser addDatosToList (List <DatosUser> listaDePersonas) {
        //encontrar el 1er dni
        String findDni = listaDePersonas.stream().findFirst().get().getDni();

        //retorno ultimo nombre de la lista

        String lastName = listaDePersonas.lastIndexOf(Nomb)

        //ordenar la lista por codigo
        Collections.sort(
                listaDePersonas,
                (persona1, persona2) -> persona1.getCodigo()
                        - persona2.getCodigo());


    }


}