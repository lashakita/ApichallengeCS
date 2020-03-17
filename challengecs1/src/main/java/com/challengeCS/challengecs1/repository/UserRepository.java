package com.challengeCS.challengecs1.repository;

import com.challengeCS.challengecs1.model.DatosUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository <DatosUser, Integer> {
    List<DatosUser>findByApellido(String apellido);
}

