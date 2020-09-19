package com.company;

public class Cat extends Animal {
    private int age;

    public Cat(int age,String breed ){
        super(breed);
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public void print(){
        System.out.println("_____________");
        super.print();
        System.out.println("Возраст " + getAge());
    }
}
