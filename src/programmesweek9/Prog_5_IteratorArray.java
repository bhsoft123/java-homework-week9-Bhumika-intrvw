package programmesweek9;
/*5. Write a Java program to iterate through all elements in an array list using
        Iterater.*/

import java.util.ArrayList;

public class Prog_5_IteratorArray {
    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList(); // declaring Array
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        myArray.add("Four");
        myArray.add("Five");

        System.out.println(myArray.size());
        for(String list : myArray)          //using iterator
            System.out.println(list);
    }

}
