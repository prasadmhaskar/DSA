package com.practice.recursion;

public class FirstOccurance {
    public static void main(String[] args) {

//In first occurrence, if element is repeated then it's first occurrence will be returned
        int[] array = {6, 3, 5, 9, 1, 4, 8, 5, 3, 5, 8, 2};
        int key = 8;
        int i = 0;
        int position = findFirstOccurance(array, key, i);
        if (position == -1){
            System.out.println("key not found");
        }
        else System.out.println("key found at index: "+position);
    }

    private static int findFirstOccurance(int[] array, int key, int i) {
        if (i == array.length){
            return -1;
        }
        if (array[i] == key){
            return i;
        }
        return findFirstOccurance(array, key, i+1);
    }
}
