package com.practice.recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "prrassssaddmhaaaaskkarrr";
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }

    private static void removeDuplicates(String str, int i, StringBuilder sb, boolean[] map) {

        if (i == str.length()){
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true){          //'a' - 'a' = 0, 'b' - 'a' = 1, 'c' - 'a' = 2 -> using this we can save true/false in map.
           removeDuplicates(str, i+1, sb, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, i+1, sb.append(currChar), map);
        }

    }
}
