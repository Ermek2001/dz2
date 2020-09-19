package com.company;

public class Dog extends Animal{
    private String name;

    public  Dog(String name, String breed){
        super(breed);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void print(){
        System.out.println("-----------------");
        super.print();
        System.out.println("Имя " + getName());
    }
}
