
import java.util.*;

public class DivisibleBy {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numebr: ");
        n = sc.nextInt();
        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println("number is divisible by 3 or 5");
        } else {
            System.out.println("number is not divisible by 3 or 5");
        }
    }
}
