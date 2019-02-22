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
        if (pets == null) {
        this.petList = new ArrayList<>();
        }
        else {
            for (Pet pet : pets) {

                pet.setOwner(this);
            }
            this.petList = new ArrayList<>(Arrays.asList(pets));


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

    int youngest = Integer.MAX_VALUE;
        for(Pet p : petList){
            if(p.getAge() < youngest){
                youngest = p.getAge();
            }

        } return youngest;

    }
    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = Integer.MIN_VALUE;
        for(Pet p : petList){
            if(p.getAge() > oldest){
                oldest = p.getAge();
            }

        } return oldest;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        int total = 0;
        for (Pet currentPet : petList) {
            total += currentPet.getAge();
        }
        return (float)total/petList.size();

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

        if(petList.size() == 0){
            return new Pet [1];
        } else{
            return petList.toArray(new Pet[petList.size()]);}
    }







}
