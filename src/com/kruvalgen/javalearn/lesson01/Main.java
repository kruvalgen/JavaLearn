package com.kruvalgen.javalearn.lesson01;

public class Main {

    public static void main(String[] args) {
        sum(3,4);
        multy(3, 4);
        subt(7, 3);
        div(12, 6);
    }
    public static void sum (int a, int b){

        int c = a + b;
        System.out.println(c);
    }
    public static void multy (int a, int b){

        int c = a * b;
        System.out.println(c);
    }
    public static void subt (int a, int b){

        int c = b - a;
        System.out.println(c);
    }
    public static void div (int a, int b){

        int c = a / b;
        System.out.println(c);
    }
}