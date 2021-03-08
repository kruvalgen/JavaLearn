package com.kruvalgen.javalearn.lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] num = new int[10];
        int[] num2 = new int[5];
        int[] num3 = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        System.arraycopy(num, 0, num2, 0, 5);
        for (int i = 0; i < num2.length ; i++) {
        }
        System.arraycopy(num, 6, num3, 0, 4);
        for (int i = 0; i < num3.length ; i++) {
            System.out.println(num3[i]);

        }
    }
}


