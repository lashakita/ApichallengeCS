package controller;
import model.ResponseResults;
import model.UserName;
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

@PostMapping(path ="/nombre", consumes = "application/json", produces = "application/json")
public UserName addUserName (@RequestBody UserName userName){
        return userNamesService.addNameToList(userName);}

}



 /*@RequestMapping(value = "/nombres", consumes ="application/json", produces ="application/json" , method = RequestMethod.POST)
    public ResponseEntity <ResponseResults>  ResponseResults (@RequestBody List<String> nombresinput){
    ResponseResults coso  = userNamesService.coso(nombresinput);
    return ResponseEntity.ok(coso);
    }*/