package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;

public class Calculator {


    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    static int subtract(int c, int d){
        int sum = c-d;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(add(9,10));
        System.out.println(subtract(8,5));
}
}
