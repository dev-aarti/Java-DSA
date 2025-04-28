import java.util.*;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 99 && n < 1000) {
            System.out.println("The entered digit is a three number digit");
        } else {
            System.out.println("The entered digit is not a three number digit");
        }
    }
}
