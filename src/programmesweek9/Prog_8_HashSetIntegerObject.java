package programmesweek9;
/*8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)*/

import java.util.HashSet;

public class Prog_8_HashSetIntegerObject {
    public static void main(String[] args) {
        //Hashset declaration
        HashSet<Integer> number = new HashSet();
        number.add(4);
        number.add(7);
        number.add(8);

        for (int i = 1; i<=10; i++) {
            if (number.contains(i)) {
                System.out.println("The number " + i + " is in the hashset" );
            } else {
                System.out.println("The number " + i + " is not in the hashset" );
            }
        }}}