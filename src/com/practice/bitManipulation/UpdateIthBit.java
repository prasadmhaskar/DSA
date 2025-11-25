package com.practice.bitManipulation;

public class UpdateIthBit {
    public static void main(String[] args) {

        System.out.println(updateIthBit(10, 2, 1));
    }
    private static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    private static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    private static int updateIthBit(int n, int i, int bit){

//--------> method 1
//        if (bit == 0){
//            return clearIthBit(n, i);
//        }
//        else return setIthBit(n, i);

//--------> method 2
        n = clearIthBit(n, i);
        int bitmask = bit << i;
        return n | bitmask;
    }
}
