package com.practice.arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {

//MyCode------------------------------------>

//        List<Integer> list = new ArrayList<>();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter numbers for finding max number between them: ");
//        for (int i = 0 ; i<= 5;i++){
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);
//        list.sort((a,b)->b-a);
//        System.out.println("Maximum number is: "+list.get(0));

//ChatGPT code-------------------------------->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 numbers to find the maximum:");

        int max = Integer.MIN_VALUE; // start with smallest possible value
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}
