package Projec_2;

public class HowManyWovels {
    /*
Create a method to count how many vowels are present in a string
“documentation”
*/
    public static void main(String[] args) {
        String wovel ="documentation";
        int count=0;
        wovel=wovel.toLowerCase();
        for (int i = 0; i < wovel.length(); i++) {
            char v=wovel.charAt(i);
            if (v=='a'||v=='e'||v=='i'||v=='o' ||v=='u'){
                count++;

            }
        }
        System.out.println("In this string there are "+count+ " wovels");
    }
}
