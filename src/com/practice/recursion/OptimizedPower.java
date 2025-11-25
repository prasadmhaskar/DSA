package com.practice.recursion;

public class OptimizedPower {
    public static void main(String[] args) {

        System.out.println(calculatePower(2, 5));
    }

    private static int calculatePower(int n, int pow) {

        if (pow == 0){
            return 1;
        }
        int halfPow = calculatePower(n, pow/2);
        int halfPowerSq = halfPow * halfPow;

        if (pow%2 != 0){
            halfPowerSq = n * halfPowerSq;
        }
        return halfPowerSq;
    }
}