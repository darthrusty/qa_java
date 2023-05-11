package com.example;

import java.util.List;

public class Lion {

    private Kittens     kittens;
    private AnimalKinds animalKinds;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.kittens     = feline;
        this.animalKinds = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalKinds.getFood("Хищник");
    }

}
