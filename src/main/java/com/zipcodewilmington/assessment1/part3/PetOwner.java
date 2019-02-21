package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private ArrayList<Pet> petList;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null)
            this.petList = new ArrayList<>();
        else
            this.petList = new ArrayList<>(Arrays.asList(pets));
        for (int i = 0; i < pets.length; i++) {
            Pet pet = pets[i];
            pet.setOwner(this);
        }



    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        this.petList.add(pet);
    }


    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.petList.remove(pet);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return petList.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
    Pet [] petArray = (Pet[])petList.toArray();
    Pet youngest = petArray[0];
        for(Pet p : petArray){
            if(p.getAge() < youngest.getAge()){
                youngest = p;
            }

        } return youngest.getAge();

    }
    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet [] petArray = (Pet[])petList.toArray();
        Integer eldest = Integer.MIN_VALUE;
        for(Pet p : petArray){
            if(p.getAge() < eldest){
                eldest = p.getAge();
            }

        } return eldest;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float agetTotal =0;
        for(Pet p : petList) {

        }


        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {


        return petList.toArray(new Pet[petList.size()]);
    }







}
