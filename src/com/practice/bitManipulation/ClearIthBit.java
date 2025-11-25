package com.practice.bitManipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }

    private static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
}
