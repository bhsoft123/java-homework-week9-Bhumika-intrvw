package programmesweek9;
/*7. Write a Java program to test if an array list is empty or not.*/

import java.util.ArrayList;

public class Prog_7_IsEmptyArray {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList();

            boolean ans = myArray.isEmpty();

            if (ans == true) {
                System.out.println("The array list is empty");
            } else {
                System.out.println("The array list is not empty");
            }

            myArray.add("Add");
            ans = myArray.isEmpty();
            if(ans == true){
                System.out.println("The array list is empty");
            } else {
                System.out.println("The array list is not empty");
            }
    }

}
