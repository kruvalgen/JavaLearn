package com.kruvalgen.javalearn.lesson06;

public class Human {

    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;


    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }



    @Override
    public String toString() {
        String text1 = "", text2 = "" , text3 = "";
        text1 = "Name " + name +
                " Sex " + (sex ? " мужской " : " женский ") +
                " Age " + age;

        if(father != null){
            text2 = " Father " + father.name;
        }
        if(mother != null){
            text3 = " Mother " + mother.name;
        }
        return text1 + text2 + text3;

    }


}
