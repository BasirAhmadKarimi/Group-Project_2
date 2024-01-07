package Projec_2;

public class CountNumOfWord {
    public static void main(String[] args) {
          /*
    Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
     */

        String words = "Syntax instructors are the best";


        String arr[] = words.split(" ");


        int wordCount = arr.length;

        System.out.println("The number of words is: " + wordCount);

    }

}
