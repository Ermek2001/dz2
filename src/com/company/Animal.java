package com.company;

public abstract class Animal implements Printable {
    private String breed;

    public Animal(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    @Override
    public void print(){
        System.out.println("Порода " + getBreed());
    }
}
