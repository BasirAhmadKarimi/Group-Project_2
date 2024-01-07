package Projec_2;

public class ReverseString {
    /*
  Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".
   */
    public static void main(String[] args) {
        String str="Bakistan";

        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);

        }
        System.out.println(reverse);
    }
}
