package programmesweek9;
/*6. Write a Java program to retrieve an element (at a specified index) from a given
array list*/

import java.util.ArrayList;

public class Prog_6_RetrieveElementOfArray {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList();
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        myArray.add("Four");
        myArray.add("Five");
        
        for (String list: myArray) {
            System.out.println(list);
        }
        System.out.println("Element at index 3 is : " +myArray.get(3));

    }
}
