package Projec_2;

public class Palindrome {
    /*
  Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome
   */
    public static void main(String[] args) {
        String pali="madam";
        String reversr="";
        for (int i=pali.length()-1; i>=0;i--){
            reversr=reversr+pali.charAt(i);

        }
        if (pali.equalsIgnoreCase(reversr)){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }
}
