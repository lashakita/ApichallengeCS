package persistence;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.UserName;
import org.springframework.stereotype.Component;
import java.io.File;

import static model.Constant.mapper;


public class UserNameStorage {

    public List<UserName> usernameInputs(){
        try {
            return mapper.readValue(
                    new File("users.json"),
                    new TypeReference<List<UserName>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } }

    public void agregarNuevoIngresoJS (List <UserName> usernameInputs){

        try {
            mapper.writeValue(
                    new File("users.json"), usernameInputs);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }





}

