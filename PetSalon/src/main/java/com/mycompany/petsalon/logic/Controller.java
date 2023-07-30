package com.mycompany.petsalon.logic;

import com.mycompany.petsalon.db.DBController;

public class Controller {
    DBController persistenceController = new DBController();

    public void save(String petName, String breed, String color, String allergic, String specialAttention, String ownerName, String ownerPhone, String observations) {
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setOwnerPhone(ownerPhone);
        
        Pet pet = new Pet();
        pet.setName(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergic(allergic);
        pet.setSpecialAtenttion(specialAttention);
        pet.setObservations(observations);
        pet.setAnOwner(owner);
        
        persistenceController.save(owner,pet);
    }
}
