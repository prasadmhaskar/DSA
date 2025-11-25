package com.practice.arrays;

import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {

//-------->printing subarrays
        int [] array = {2,4,6,8,10};

        for (int i=0 ; i< array.length ; i++){
            for (int j=i ; j< array.length;j++){
                for (int k=i; k <= j; k++){
                    System.out.print(array[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
