package com.challengeCS.challengecs1.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.challengeCS.challengecs1.services.UserNamesService;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class UserNamesController {

    private UserNamesService userNamesService;

    public UserNamesController(UserNamesService userNamesService) {
        this.userNamesService = userNamesService;
    }

    //POST punto 1//
    @PostMapping("/nombre")
    public ResponseEntity<Object> jsonPost1(@RequestBody List<String> nombresIngresadosUser) {
        return ResponseEntity.ok(userNamesService.outputJson(nombresIngresadosUser));
    }


}
