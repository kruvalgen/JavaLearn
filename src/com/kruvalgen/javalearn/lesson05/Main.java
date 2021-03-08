package com.kruvalgen.javalearn.lesson05;

public class Main {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Max", 2, 1800);
        Robot robot2 = new Robot("Max", 2, 2000);


        boolean b = robot1.fight(robot2);
        System.out.println(b);
    }
}
