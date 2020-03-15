package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.ResponseResults;
import model.UserName;
import org.springframework.stereotype.Service;
import persistence.UserNameStorage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static model.Constant.mapper;


@Service
public class UserNamesService {

    public UserNameStorage userNameStorage;
    public List <UserName> usernameInputs;

    /*ArrayList<UserName> inputs = mapper.writeValue(new File("users.json"),
            mapper.getTypeFactory().constructCollectionType(ArrayList.class, UserName.class));*/

    public UserNamesService (UserNameStorage userNameStorage){ this.userNameStorage  = userNameStorage;}
    public List<UserName> getUsernameInputs() {
        return usernameInputs;
    }

    public UserName addNameToList (UserName nuevoUserName){
        long count = usernameInputs.stream().count();
        int i=usernameInputs.stream().skip(count - 1).findFirst().get().getCodigo();
        nuevoUserName.setCodigo(i+1);
        getUsernameInputs().add(nuevoUserName);
        this.userNameStorage.agregarNuevoIngresoJS(usernameInputs);
        return nuevoUserName;

    }
//private ResponseResults responseResults;
    /*public ResponseResults coso(List<String> nombresinput) {
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
    }*/


}