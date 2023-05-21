public class Patterns {
    public static void main(String[] args) {

        // Solid Patterns Problem

        int n = 4;
        int m = 3;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // Hollow Patterns

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}