package com.practice.bitManipulation;

public class GetIthBit {
    public static void main(String[] args) {

        System.out.println(getIthBitt(10,3));
    }

    private static int getIthBitt(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0){
            return 0;
        }
        else return 1;
    }
}
