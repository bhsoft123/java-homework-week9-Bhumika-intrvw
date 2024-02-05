package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char anotherOperation = 'Y';
        while (anotherOperation == 'Y' || anotherOperation == 'y') {

            System.out.println("Enter two numbers with operation to be performed (eg. 3 + 2) with space in between:");
            sc.useDelimiter("[\\s,]+"); // take all three input in one line
            int a = sc.nextInt();
            char c = sc.next().charAt(0);
            int b = sc.nextInt();
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, c);
            System.out.println("Would you like to do more calculation? Enter Y or N :");
            anotherOperation = sc.next().charAt(0);
        }
        sc.close();
    }
}
