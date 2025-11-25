package com.practice.arrays;

public class Pairs {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};

        for (int i=0; i< array.length; i++){
            for (int j=i+1; j< array.length;j++){
                System.out.println(array[i]+ "," + array[j]);
            }
            System.out.println();
        }
    }
}
