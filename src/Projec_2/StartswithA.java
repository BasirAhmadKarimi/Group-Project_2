package Projec_2;

import java.util.ArrayList;

public class StartswithA {
    public static void main(String[] args) {
         /*
    You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case"
     */
        ArrayList<String> keep=new ArrayList<>();
        keep.add("Ahmad");
        keep.add("Carlos");
        keep.add("Afghanistan");
        keep.add("Jack");
        keep.add("car");

        for (String name : keep) {
            if (name.startsWith("A")) {
                System.out.println(name.toLowerCase());
            }
        }
    }
}
