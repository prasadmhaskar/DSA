package com.practice.other;

import java.util.Scanner;

public class FactorialIteratively {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate it's factorial");
        int number = sc.nextInt();

        int next = 1;
        for(int i=number; i>= 1; i--){
            next = next*i;
        }
        System.out.println(next);
    }
}
