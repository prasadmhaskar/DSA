package com.practice.strings;

public class ToUpperCase {
    public static void main(String[] args) {
        String original = "hii, my name is prasad";
        upperCase(original);
    }

    private static void upperCase(String str) {

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
