import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("You will get NId card");
        // }

        // else {
        // System.out.println("You will not get nid card");
        // }

        // Check even and odd numbers
        // int x = sc.nextInt();
        // if (x % 2 == 0) {
        // System.out.println("Even Number");
        // }

        // else {
        // System.out.println("Odd NUmber");
        // }

        // check conditions

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("Equals");
        // } else if (a > b) {
        // System.out.println("A is grater then b");
        // } else {
        // System.out.println("B is grater then A");
        // }

        // Break

        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid COde");

        }
    }
}