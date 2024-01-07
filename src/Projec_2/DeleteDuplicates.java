package Projec_2;

import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicates {
    public static void main(String[] args) {
        /*
    How can you remove all duplicates from ArrayList
     */

            ArrayList<String> duplicateList = new ArrayList<>();
            duplicateList.add("Mike");
            duplicateList.add("David");
            duplicateList.add("Sam");
            duplicateList.add("Karimi");
            duplicateList.add("Sam");
            duplicateList.add("David");
            duplicateList.add("David");
            duplicateList.add("Mike");
            duplicateList.add("Sam");

            System.out.println("List with duplicates " + duplicateList);

            List<String> withoutDuplicateList = new ArrayList<>();

            for (String element : duplicateList) {
                if (!withoutDuplicateList.contains(element)) {
                    withoutDuplicateList.add(element);
                }
            }

            System.out.println("List without duplicates " + withoutDuplicateList);
    }
}
