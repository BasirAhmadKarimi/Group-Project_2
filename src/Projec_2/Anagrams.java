package Projec_2;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
          /*
    Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
     */
        String anagram1="listen";
        String anagram2="silent";
        anagram1=anagram1.toLowerCase();
        anagram2=anagram2.toLowerCase();
        if (anagram1.length() !=anagram2.length()){
            System.out.println("The string is not anagram");
        }else{
           char[] str1=anagram1.toCharArray();
           char[] str2=anagram2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1,str2)){
                System.out.println("The string is anagram");
            }else{
                System.out.println("The string is not anagram");
            }
        }

    }
}
