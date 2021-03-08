package com.kruvalgen.javalearn.lesson06;

public class Main  {

    public static void main(String[] args) {

        Human grandFather1 = new Human("Max", true, 67);
        Human grandFather2 = new Human("Alex", true, 62);

        Human grandMother1 = new Human("Olesya", false, 65);
        Human grandMother2 = new Human("Olga", false, 60);

        Human father = new Human("Oleg", true, 32,grandFather1,grandMother1);
        Human mother = new Human("Maria", false, 30, grandFather2,grandMother2);

        Human son = new Human("Misha", true, 10, father, mother);
        Human dother = new Human("Daria", false, 8, father, mother);


        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(dother);


    }
}


