package programmesweek9;
//3. Write a Java program to reverse an array of integer values.
import java.util.Arrays;
import java.util.Collections;

public class Prog_3_ReverseIntegerArray {

    public static void main(String[] args) {
        Integer [] myArray = { 1,2,3,4,5,6};
        System.out.println("Original Array :" + Arrays.asList(myArray));
        reverseArray(myArray);
    }
        public static void reverseArray(Integer[] myArray){
            Collections.reverse(Arrays.asList(myArray));
            System.out.println("Reversed Array : " + Arrays.asList(myArray));
       }
}
