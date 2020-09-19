package com.company;

public class Cow extends Animal {
    private String color;

    public Cow (String color, String breed){
        super(breed);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void print(){
        System.out.println("------------------");
        super.print();
        System.out.println("Цвет" + getColor());

    }
}
