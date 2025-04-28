import java.util.*;

public class GreatestOfThree {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        a = sc.nextInt();
        // System.out.println("Enter the first number:- ");
        // b = sc.nextInt();
        // System.out.println("Enter the number:- ");
        // c = sc.nextInt();
        System.out.println((a % 2 == 0) ? "Even" : "Odd");
    }
}
