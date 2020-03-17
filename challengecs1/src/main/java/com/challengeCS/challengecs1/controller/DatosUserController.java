package com.challengeCS.challengecs1.controller;

import com.challengeCS.challengecs1.model.DatosUser;
import com.challengeCS.challengecs1.services.DatosUserSerivce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class DatosUserController {

private DatosUserSerivce datosUserSerivce;

public DatosUserController (DatosUserSerivce datosUserServirce){this.datosUserSerivce = datosUserServirce;}

 @PostMapping("/datos")
 public ResponseEntity <Object> postDatosUser (@RequestBody List<DatosUser> datosPersonaPost) {
    return ResponseEntity.ok(datosUserSerivce.addDatosToList(datosPersonaPost));
    }

}


