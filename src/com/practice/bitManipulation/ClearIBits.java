package com.practice.bitManipulation;

public class ClearIBits {
    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
    }

    private static int clearIBits(int n, int i) {

        int bitmask = (~0) << i;
        return n & bitmask;
    }
}
