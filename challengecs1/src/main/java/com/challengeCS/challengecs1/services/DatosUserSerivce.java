package com.challengeCS.challengecs1.services;

import com.challengeCS.challengecs1.model.DatosUser;
import com.challengeCS.challengecs1.wrapper.PuntoDosWrapper;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class DatosUserSerivce {

    //punto 2
    public PuntoDosWrapper addDatosToList(List<DatosUser> listaDePersonas) {
        PuntoDosWrapper sortPostPunto2 = new PuntoDosWrapper();

        {   //encontrar el 1er dni
            sortPostPunto2.setPrimerDni(listaDePersonas.stream().findFirst().get().getDni());

            // ultimo nombre
            sortPostPunto2.setUltimoNombre(listaDePersonas.get(listaDePersonas.size() - 1).getNombre());

            //ordenar la lista por codigo
           Collections.sort(listaDePersonas, (persona1, persona2) -> persona1.getCodigo() - persona2.getCodigo());
           sortPostPunto2.setListaOrdenadaPorCodigo(listaDePersonas);
        }
        return sortPostPunto2;
    }
}