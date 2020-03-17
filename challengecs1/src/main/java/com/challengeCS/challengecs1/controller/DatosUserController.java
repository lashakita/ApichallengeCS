package com.challengeCS.challengecs1.controller;

import com.challengeCS.challengecs1.model.DatosUser;
import com.challengeCS.challengecs1.model.repository.UserRepository;
import com.challengeCS.challengecs1.services.DatosUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping ("/api")
public class DatosUserController {
    @Autowired
    private UserRepository userRepository;

    private DatosUserSerivce datosUserSerivce;

    public DatosUserController(DatosUserSerivce datosUserServirce) {
        this.datosUserSerivce = datosUserServirce;
    }

    //puntos 2 y 3
    @PostMapping("/datos")
    public ResponseEntity<Object> postDatosUser(@RequestBody List<DatosUser> datosPersonaPost) {
        datosPersonaPost.forEach(DatosUser -> userRepository.save(DatosUser));
        return ResponseEntity.ok(datosUserSerivce.addDatosToList(datosPersonaPost));
    }

    //get apellidos
        @GetMapping(path="/apellidos")
        public ResponseEntity <List <DatosUser>> findApellidoPerez (String apellido) {
        return ResponseEntity.ok(userRepository.findByApellido(apellido));
    }


}







