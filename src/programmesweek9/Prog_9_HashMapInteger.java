package programmesweek9;
/*9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;
import java.util.Map;

public class Prog_9_HashMapInteger {
    public static void main(String[] args) {
        //Create a HashMap to store names and roll numbers
        HashMap<String, Integer> people = new HashMap<>();
        //Add key value pairs to the map
        people.put("Amruta", 101);
        people.put("Shraddha", 102);
        people.put("Seema", 103);
        people.put("Bhumika", 104);
        people.put("Shalini", 105);
        people.put("Vishal", 106);
        people.put("Nishit", 107);
        iterateAndPrintValues(people);
    }

        //methods to iterate and print values from the map
    public static void iterateAndPrintValues(Map<String,Integer> map) {
        System.out.println("Values in the map: ");
        for (Integer age : map.values()) {
            System.out.println(age);
        }
    }
    }
