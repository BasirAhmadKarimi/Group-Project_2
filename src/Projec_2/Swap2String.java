package Projec_2;

public class Swap2String {
    public static void main(String[] args) {
      /*
    Write a program to swap 2 String without a temporary variable
     */

            String word1 = "Going";
            String word2 = "On";
            System.out.println("Before swapping: " + word1 + " " + word2);
            word1 += word2;
        word2 = word1.substring(0, (word1.length() - word2.length()));
           word1 = word1.substring(word2.length());

            System.out.println("After swapping: " + word1 + " " + word2);
        }
    }
