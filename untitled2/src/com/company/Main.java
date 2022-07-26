package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static int count;

    public static void main(String[]args) {
        Scanner ss =new Scanner(in);
   int count=0;

        for (int i =0;i<100;i++){
            if (i%5==0){
                count++;

            }
        }
        System.out.println(count);
    }


    public static void vasila(String[] args) {
        Scanner scanner = new Scanner(in);
        int a=3;
        for (int i = 0; i < 100; i++) {
       if (i%3==0){
           a++;
           System.out.println(a);
        }

    }
    }
}