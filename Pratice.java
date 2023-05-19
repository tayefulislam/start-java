import java.util.*;

public class Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwordUser = 3424;
        int passwordAdmin = 2343;
        int passwordInput = sc.nextInt();

        if (passwordUser == passwordInput) {
            System.out.println("You Have access as USer ");
        } else if (passwordAdmin == passwordInput) {
            System.out.println("You have access as Admin");
        } else {
            System.out.println("Access Restricted");
        }
    }
}