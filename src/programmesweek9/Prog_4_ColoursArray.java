package programmesweek9;
/*4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/

public class Prog_4_ColoursArray {
    public static void main(String[] args) {
        String [] myArray = {"Red", "White", "Green", "Blue","Orange"};
        System.out.println(myArray.length);
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

}
