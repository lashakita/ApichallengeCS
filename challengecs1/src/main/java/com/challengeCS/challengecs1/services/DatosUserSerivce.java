package com.challengeCS.challengecs1.services;

import com.challengeCS.challengecs1.model.DatosUser;
import com.challengeCS.challengecs1.wrapper.PuntoDosWrapper;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class DatosUserSerivce {

    //punto 2
    public PuntoDosWrapper addDatosToList(List<DatosUser> listaDePersonas) {
        PuntoDosWrapper pipo = new PuntoDosWrapper();
        pipo.setDatosDeUsuario(listaDePersonas);
        {   //ordenar la lista por codigo
            Collections.sort(listaDePersonas, (persona1, persona2) -> persona1.getCodigo() - persona2.getCodigo());

        }

        //encontrar el 1er dni
        pipo.getPrimerDni();
        // ultimo nombre
        pipo.getUltimoNombre();

        return pipo;

    }
}