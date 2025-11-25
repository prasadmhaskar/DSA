package com.practice.arrays;

public class CountEvenOdd {
    public static void main(String[] args) {

//Count the number of even and odd elements.

        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int odd = 0;
        int even = 0;
        for(int i=0; i< array.length; i++){
            if(array[i]%2 == 0){
                even++;
            }
            else {odd++;}
        }
        System.out.println("Even numbers:"+even+ " , Odd numbers:"+odd);
    }
}
