package com.kruvalgen.javalearn.lesson02;

import java.util.Objects;

public class User {
   private String name;
   private int age;
   private String passportData;

   public User(String name, int age, String passportData){
       this.name = name;
       this.age = age;
       this.passportData = passportData;
   }
    public User(String name, int age){
        this.name = name;
        this.age = age;

    }
   public int getAge(){
       return this.age;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }

}

