package com.practice.arrays;

public class SumAndAverage {
    public static void main(String[] args) {

//Find the sum and average of all elements in an array.

        int[] array = {2,6,3,5,1,9,8,4,7,10};

        int sum = 0;
        for(int i=0 ; i< array.length ; i++){
          sum = sum + array[i];
        }

        System.out.println("Sum of all elements: "+sum);

        float average = (float) sum / array.length;
        System.out.println("Average of all elements: "+average);
    }
}
