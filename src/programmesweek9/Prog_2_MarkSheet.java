package programmesweek9;

import java.util.Scanner;
    /**Write a java program to input student Name, roll No, and three subjects Math, Science and
     English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     Input, Marks should between 0 to 100”) and find out total, percentage and result.
     If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     _______________________________
     | |
     | Mark Sheet |
     |_______________________________|
     | Name : Jay |
     | Roll No : 08 |
     |_______________________________|
     | Subjects : Marks |
     |_______________________________|
     | Math : 98 |
     | Science : 90 |
     | English : 85 |
     |_______________________________|
     | Total : 273 |
     |_______________________________|
     | Percentage : 91.0 |
     | Result : Pass |
     | Grade : A+ |
     |_______________________________|**/

    public class Prog_2_MarkSheet {

        //declaring variables as static, to use in other methods
        static String stname;
        static String rollno;
        static int maths;
        static int science;
        static int english;
        static int total;
        static double percentage;
        static String result;
        static String grade;

        //main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char anotherOperation = 'Y';

            while (anotherOperation == 'Y' || anotherOperation == 'y') {
                System.out.println("Please enter Student Name and Roll no:");
                stname = sc.nextLine();
                rollno = sc.nextLine();
                System.out.println("Please enter marks in following subjects: ");
                System.out.println("Maths: ");
                maths = sc.nextInt();
                System.out.println("Science: ");
                science = sc.nextInt();
                System.out.println("English: ");
                english = sc.nextInt();

                if (validEntry()){

                } else {
                passOrFail();
                gradecalculator();
                System.out.println("Would you like to perfrom anoter operation? Y or N :");
                anotherOperation = sc.next().charAt(0);
            }}
            sc.close();
        }

        //method to check valid entry
        public static boolean validEntry(){
            if ((maths < 0 || maths > 100) || (science < 0 || science > 100) || (english < 0 || english > 100)) {
                System.out.println("Invalid input, Marks should be between 0 and 100");
                return true;
            } else {
                System.out.println("Calculating final result..");
                return false;
            }}
        //method to check pass or fail
        public static void passOrFail(){
            if(maths < 35 || science < 35 || english <35 ){
                result = "Fail";
            } else {
                result = "Pass";
            }
        }

        //method to calculate grade and result
        public static void gradecalculator(){
            total = maths + science + english;
            percentage = (total) / 3;
            if (percentage >= 80) {
                // = "Pass";
                grade = "A+";
            } else if (percentage < 80 && percentage >= 60) {
                //result = "Pass";
                grade = "A";
            } else if (percentage < 60 && percentage >= 50) {
               // result = "Pass";
                grade = "B";
            } else if (percentage < 50 && percentage >= 35) {
               //result = "Pass";
                grade = "C";
            } else {
               // result = "Fail";
                grade = "Nil";
            }
            System.out.println(result +" " + grade);
            printresult();
        }

        //method to print result
        public static void printresult(){
            System.out.println("__________________________________________");
            System.out.println("|                                        |");
            System.out.println("|             Mark Sheet                 |");
            System.out.println("|________________________________________|");
            System.out.println("|   Name           :    " +stname +     "           |");
            System.out.println("|   Rollno         :    " +rollno+ "               |");
            System.out.println("|______________________________________|");
            System.out.println("|   Subjects       :     Marks         |");
            System.out.println("|______________________________________|");
            System.out.println("|   Maths          :    " +maths +"                |");
            System.out.println("|   Science        :    " +science +"             |");
            System.out.println("|   English        :    " +english +"           |");
            System.out.println("|______________________________________|");
            System.out.println("|   Total          :    " +total + "          |");
            System.out.println("|______________________________________|");
            System.out.println("|   Percentage     :  " +percentage +"%" +"       |");
            System.out.println("|   Result         :    " +result   +"             |");
            System.out.println("|   Grade          :    " +grade +"                    |");
            System.out.println("|______________________________________|");
        }
    }




