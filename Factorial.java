import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;

        if (n == 0) {
            System.out.println("1");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println(f);
        }
    }
}
