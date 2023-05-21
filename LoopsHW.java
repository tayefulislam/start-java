import java.util.*;

public class LoopsHW {
    public static void main(String[] args) {

        /*
         * 
         * Problem No 1 : Print all even numbers till n.
         * 
         */

        Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter value of n : ");
        // int n = sc.nextInt();

        // System.out.print("Even numbers are : ");

        // for (int i = 0; i <= n; i++) {
        // if (i % 2 != 0) {
        // System.out.print(i);
        // System.out.print(" ");
        // }
        // }

        // Problem 2;

        // for (;;) {
        // System.out.println("Apna College");
        // }

        // Problem 3

        int n = sc.nextInt();

        if (n != 1 & n != 0) {
            System.out.println("Invalid Entry");
        } else if (n == 1) {
            System.out.print("Please enter you mark: ");
            int mark = sc.nextInt();

            if (mark >= 0 && mark <= 100) {
                if (mark >= 90 & mark <= 100) {
                    System.out.println("This is Good");
                } else if (mark >= 60 & mark <= 89) {
                    System.out.println("This is also Good");
                } else {
                    System.out.println("This is Good as well");
                }

            } else {
                System.err.println("Please enter valid number");
            }

        }

    }
}

/*
 * Homework Problems
 * Problem No 1 : Print all even numbers till n.
 * Step : 1
 * Take input of n.
 * 
 * 
 * Problem 2 :
 * Run
 * for(; ;) {
 * System.out.println("Apna College");
 * }
 * loop on your system and analyze what happens. Try to think of the reason for
 * the output produced.
 * 
 * 
 * Problem 3:
 * 
 * 
 * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
 * If the user enters 1 then keep taking input from the user for a student’s
 * marks(out of 100).
 * If they enter 0 then stop.
 * If he/ she scores :
 * Marks >=90 -> print “This is Good”
 * 89 >= Marks >= 60 -> print “This is also Good”
 * 59 >= Marks >= 0 -> print “This is Good as well”
 * Because marks don’t matter but our effort does.
 * (Hint : use do-while loop but think & understand why)
 * 
 * 
 */
