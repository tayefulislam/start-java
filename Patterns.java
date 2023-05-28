public class Patterns {
    public static void main(String[] args) {

        // Solid Patterns Problem

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // Hollow Patterns

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= m; j++) {

        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // }

        // else {
        // System.out.print(" ");
        // }

        // }

        // System.out.println();
        // }

        // /* Half Pyramid */

        // int n = 4;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        /* Inverted Half Pyramid */

        // int n = 4;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /* Inverted half pyramid - Rotated By 180 */

        // int n = 7;
        // // Outer Loop

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        /* Half Pyramid with Numbers */
        // int n = 5; // raw number

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }

        // System.out.println();

        // }

        /* Inverted Half Pyramid With Number */

        // int n = 5;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j + " ");
        // }

        // System.out.println();
        // }

        // Floyd's Triangle

        // int n = 5;

        // int number = 1;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }

        /*
         * 0 1 Triangle
         * 
         * 
         */

        // int n = 5;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print(1 + " ");
        // } else {
        // System.out.print(0 + " ");
        // }
        // }
        // System.out.println();

        // }

        int n = 5;
        // Print a solid rhombus.

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
