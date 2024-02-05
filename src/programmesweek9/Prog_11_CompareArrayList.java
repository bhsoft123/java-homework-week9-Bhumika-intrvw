package programmesweek9;
/* 11. Declare following two arrylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");*/

import java.util.ArrayList;

public class Prog_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.add("White");

        System.out.println("ArrayList 1 :" + c1);
        System.out.println("ArrayList 2 :" + c2);

        if(c1.equals(c2)== true){
            System.out.println("Array Lists are equal");
        } else {
            System.out.println("Array Lists are not equal");
        }
    }
}
