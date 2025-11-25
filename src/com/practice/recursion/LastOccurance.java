package com.practice.recursion;

public class LastOccurance {
    public static void main(String[] args) {
//In last occurrence, if element is repeated then it's last occurrence will be returned
        int[] array = {6, 3, 5, 9, 1, 4, 8, 5, 3, 5, 8, 2, 9, 8};
        int key = 8;
        int i = 0;
        int position = findLastOccurance(array, key, i);
        if (position == -1){
            System.out.println("key not found");
        }
        else System.out.println("key found at index: "+position);
    }

    private static int findLastOccurance(int[] array, int key, int i) {

//myCode
        if (i == array.length){
            return -1;
        }
        if (array[i] == key){
            int next = findLastOccurance(array, key, i+1);
            if (next > i){
                return next;
            }
            return i;
        }
        return findLastOccurance(array, key, i+1);

//AC code
//        if (i == array.length){
//            return -1;
//        }
//        int isFound = findLastOccurance(array, key, i+1);
//        if (isFound == -1 && array[i] == key){
//            return i;
//        }
//        return isFound;
    }
}
