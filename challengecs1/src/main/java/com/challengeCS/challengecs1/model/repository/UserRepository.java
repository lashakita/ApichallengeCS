package com.challengeCS.challengecs1.model.repository;

import com.challengeCS.challengecs1.model.DatosUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository <DatosUser, Integer> {
    @Query("select o from MyObject o where inventoryId in :Perez")
    List<DatosUser> findPerez(@Param("Perez") List<DatosUser> datosPersonaPost);
}
