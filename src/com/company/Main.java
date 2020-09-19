package com.company;

import java.awt.print.Printable;

public class Main {

    public static void main(String[] args) {
        Printable cat = createObject("cat");
        Printable cow = createObject("cow");
        Printable dog = createObject("dog");

        Printable[] printables = {cat,cow, dog};
        for (int i = 0; i <printables.length ; i++) {
            printables[i].print();

        }
    }

    public static Printable createObject (String className){

        return switch (className){
            case "cat" new Cat(5,"russ");
            case "cow" new Cow ("black", "aziyat");
            case "dog" new Dog ("rex", "doberman");
            default null;
        }
    }
}
