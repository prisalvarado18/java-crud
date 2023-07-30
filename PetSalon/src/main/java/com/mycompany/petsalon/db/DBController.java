package com.mycompany.petsalon.db;

import com.mycompany.petsalon.logic.Owner;
import com.mycompany.petsalon.logic.Pet;

public class DBController {
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        //Create owner in the DB
        ownerJpa.create(owner);
        //Create pet in the DB
        petJpa.create(pet);
    }
}
