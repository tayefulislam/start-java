import java.util.*;

public class Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int passwordUser = 3424;
        // int passwordAdmin = 2343;
        // int passwordInput = sc.nextInt();

        // if (passwordUser == passwordInput) {
        // System.out.println("You Have access as USer ");
        // } else if (passwordAdmin == passwordInput) {
        // System.out.println("You have access as Admin");
        // } else {
        // System.out.println("Access Restricted");
        // }

        /*
         * Homework Problems
         * Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
         * follows :
         * 1 : + (Addition) a + b
         * 2 : - (Subtraction) a - b
         * 3 : * (Multiplication) a * b
         * 4 : / (Division) a / b
         * 5 : % (Modulo or remainder) a % b
         * Calculate the result according to the operation given and display it to the
         * user.
         * 
         */

        int a = sc.nextInt();
        String button = sc.next();
        int b = sc.nextInt();

        switch (button) {
            case "+": {
                int add = a + b;
                System.out.print("Addition:");
                System.out.println(add);
            }
                break;

            case "-": {
                int subtra = a - b;
                System.out.print("Subtraction:");
                System.out.println(subtra);
            }
                break;
            case "*": {
                int multi = a * b;
                System.out.print("Multiplication:");
                System.out.println(multi);
            }
                break;

            case "/": {
                int divi = a / b;
                System.out.print("Division:");
                System.out.println(divi);
            }
                break;

            case "%": {
                int modulo = a % b;
                System.out.print("Modulo:");
                System.out.println(modulo);
            }

            default:
                System.out.println("In valid entry");

        }

    }
}