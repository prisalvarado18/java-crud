package com.mycompany.petsalon.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_client;
    private String name;
    private String breed;
    private String color;
    private String allergic;
    private String specialAtenttion;
    private String observations;
    @OneToOne
    private Owner anOwner;

    public Pet() {
    }

    public Pet(int num_client, String name, String breed, String color, String allergic, String specialAtenttion, String observations, Owner anOwner) {
        this.num_client = num_client;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.allergic = allergic;
        this.specialAtenttion = specialAtenttion;
        this.observations = observations;
        this.anOwner = anOwner;
    }

    public int getNum_client() {
        return num_client;
    }

    public void setNum_client(int num_client) {
        this.num_client = num_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecialAtenttion() {
        return specialAtenttion;
    }

    public void setSpecialAtenttion(String specialAtenttion) {
        this.specialAtenttion = specialAtenttion;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Owner getAnOwner() {
        return anOwner;
    }

    public void setAnOwner(Owner anOwner) {
        this.anOwner = anOwner;
    }

    @Override
    public String toString() {
        return "Pet{" + "num_client=" + num_client + ", name=" + name + ", breed=" + breed + ", color=" + color + ", allergic=" + allergic + ", specialAtenttion=" + specialAtenttion + ", observations=" + observations + ", anOwner=" + anOwner + '}';
    }
    
    
}
