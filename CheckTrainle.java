import java.util.*;

public class CheckTrainle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***********Consider a Traingle abc and enter their size of sides respectively***********");

        System.out.println("Enter the side ab :-");
        int ab = sc.nextInt();
        System.out.println("Enter the side bc :-");
        int bc = sc.nextInt();
        System.out.println("Enter the side ac :-");
        int ac = sc.nextInt();

        if (ab == bc && bc == ac) {
            System.out.println("The traingle is Equilateral Triangle.");
        } else if (ab == bc && bc != ac) {
            System.out.println("The traingle is isosceles");
        } else if (ab != bc && bc == ac) {
            System.out.println("The traingle is isosceles");
        } else {
            System.out.println("The traingle is scalene");
        }

    }
}
