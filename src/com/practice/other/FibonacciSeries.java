package com.practice.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Fibonacci series: ");
        int number = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int a = 0, b = 1;
        if (number >= 1) list.add(a);
        if (number >= 2) list.add(b);

        for (int i = 2; i < number; i++) {
            int next = a + b;
            list.add(next);
            a = b;
            b = next;
        }

        System.out.println("Fibonacci series: " + list);
        sc.close();
        }
    }
