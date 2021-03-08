package com.kruvalgen.javalearn.lesson03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Как Вас зовут?");
        String name = n.readLine();

        System.out.println("Сколько Вы планируете получать?");
        int sum = Integer.parseInt(n.readLine());

        System.out.println("Через какое время?");
        int time = Integer.parseInt(n.readLine());

        System.out.println(name + " будет получать $ " + sum + " через " + time + " года.");

    }

    public static float convert (float usd) {
        float eur = (float) (usd / 1.22);
        return eur;
    }

}
