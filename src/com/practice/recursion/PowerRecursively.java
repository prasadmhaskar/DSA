package com.practice.recursion;

public class PowerRecursively {
    public static void main(String[] args) {
        System.out.println(powerRecur(2,8));
    }

    private static int powerRecur(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * powerRecur(base, exponent -1);
    }
}
