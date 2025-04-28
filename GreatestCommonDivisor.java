import java.util.*;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int a, b;
        int GCD = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Seconds Number: ");
        b = sc.nextInt();

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GDC is : " + GCD);
    }
}
