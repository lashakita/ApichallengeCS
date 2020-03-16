package com.challengeCS.challengecs1.persistence;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.challengeCS.challengecs1.model.DatosUser;
import org.springframework.stereotype.Component;

import java.io.File;

import static com.challengeCS.challengecs1.model.Constant.mapper;

@Component
public class DatosUserStorage {

    public List<DatosUser> usernameInputs(){
        try {
            return mapper.readValue(
                    new File("users.json"),
                    new TypeReference<List<DatosUser>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } }

    public void agregarNuevoIngresoJS (List <DatosUser> usernameInputs){

        try {
            mapper.writeValue(
                    new File("users.json"), usernameInputs);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

}

