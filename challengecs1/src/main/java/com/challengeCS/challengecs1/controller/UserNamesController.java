package com.challengeCS.challengecs1.controller;
import com.challengeCS.challengecs1.model.ResponseResults;
import com.challengeCS.challengecs1.model.UserName;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.challengeCS.challengecs1.services.UserNamesService;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class UserNamesController {

    private UserNamesService userNamesService;
    public UserNamesController(UserNamesService userNamesService){
        this.userNamesService=userNamesService;
    }

@PostMapping("/nombre")
  public ResponseEntity <Object> jsonPost1 (@RequestBody List<String> nombresIngresadosUser){
        return ResponseEntity.ok(userNamesService.outputJson(nombresIngresadosUser));}



}







 /*@RequestMapping(value = "/nombres", consumes ="application/json", produces ="application/json" , method = RequestMethod.POST)
    public ResponseEntity <ResponseResults>  ResponseResults (@RequestBody List<String> nombresinput){
    ResponseResults coso  = userNamesService.coso(nombresinput);
    return ResponseEntity.ok(coso);
    }*/