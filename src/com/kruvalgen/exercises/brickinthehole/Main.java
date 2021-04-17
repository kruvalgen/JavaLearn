package com.kruvalgen.exercises.brickinthehole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Hole hole = new Hole();
        System.out.println("Введите диаметр отверстия: ");
        hole.setHoleDiameter(Integer.parseInt(reader.readLine()));


        Brick brick = new Brick();
        System.out.println("Введите высоту кирпича: ");
        brick.setBrickHeight(Integer.parseInt(reader.readLine()));
        System.out.println("Введите ширину кирпича: ");
        brick.setBrickWidth(Integer.parseInt(reader.readLine()));
        System.out.println("Введите длину кирпича: ");
        brick.setBrickLength(Integer.parseInt(reader.readLine()));
        System.out.println(brick.brickDiagonal());

       if(hole.getHoleDiameter() >= brick.brickDiagonal()){
           System.out.println("Кирпич проходит в отверстие");
       }else {
           System.out.println("Кирпич больше отверстия");
       }





    }

}