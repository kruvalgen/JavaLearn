package com.kruvalgen.javalearn.lesson02;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        User user = new User("Max", 17, "8674343");
        System.out.println(user.getName());
        user.setName("Sacha");
        System.out.println(user.getName());

        User user1 = new User("Alex", 25);
        System.out.println();

    }


}
