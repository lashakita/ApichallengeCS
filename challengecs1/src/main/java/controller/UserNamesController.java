package controller;
import model.ResponseResults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.UserNamesService;

import java.util.List;

@RestController

public class UserNamesController {


    private UserNamesService userNamesService;


    public UserNamesController(UserNamesService userNamesService){
        this.userNamesService=userNamesService;
    }

   @RequestMapping(value = "/nombres", consumes ="application/json", produces ="application/json" , method = RequestMethod.POST)
    public ResponseEntity <ResponseResults>  ResponseResults (@RequestBody List<String> nombresinput){
    ResponseResults coso  = userNamesService.coso(nombresinput);
    return ResponseEntity.ok(coso);
    }

}
