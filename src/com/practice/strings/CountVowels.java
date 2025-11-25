package com.practice.strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

//myCode--------------------------------------->
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String for counting vowels");
//        String word = sc.nextLine();
//        String[] splitt = word.toLowerCase().split("");
//        int count = 0;
//        for(int i= 0 ; i< splitt.length;i++){
//            if(splitt[i].equals("a") || splitt[i].equals("e") || splitt[i].equals("i") || splitt[i].equals("o") || splitt[i].equals("u")){
//                count++;
//            }
//        }
//        System.out.println("Total vowels: "+count);

//chatGPT code-------------------------------------------------->
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String for counting vowels: ");
        String word = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total vowels: " + count);
        sc.close();
    }
}
