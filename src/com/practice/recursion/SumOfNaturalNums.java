package com.practice.recursion;

public class SumOfNaturalNums {
    public static void main(String[] args) {

        System.out.println(sumOfNaturalNums(10));
    }

    private static int sumOfNaturalNums(int i) {
        if (i == 1){
            return 1;
        }
        return i + sumOfNaturalNums(i-1);
    }
}
