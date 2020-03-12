package services;

import model.ResponseResults;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserNamesService {

    private ResponseResults responseResults;

    public UserNamesService(ResponseResults responseResults) {
        this.responseResults = responseResults;
    }

    public ResponseResults coso(List<String> nombresinput) {
        ResponseResults res = new ResponseResults();
        for (String nombre : nombresinput) {
            if (nombre.startsWith("LU")) {
                res.addNombresLu(nombre);
            }
            if (nombre.endsWith("S")){
                res.addNombresFinS(nombre);
            }
           res.setCantidadNombres(4);
        }

        return res;
    }
}