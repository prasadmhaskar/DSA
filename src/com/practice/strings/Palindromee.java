package com.practice.strings;

import java.util.Scanner;

public class Palindromee {
    public static void main(String[] args) {

//myCode------------------------------------------>

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to check it is palindrome or not: ");
//        String original = sc.nextLine().toLowerCase();
//        String reversed = new StringBuilder(original).reverse().toString();
//        if (original.equals(reversed)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }

//chatGPT code------------------------------------>

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check it is palindrome or not: ");
        String original = sc.nextLine().toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < original.length() / 2; i++) {
            if (original.charAt(i) != original.charAt(original.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
    }
}
