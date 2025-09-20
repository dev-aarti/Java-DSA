package Loops;
//Print hello world 'n' times, Take 'n' as input from user.
import java.util.*;
public class BasicsOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print \"Hello World\": ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Hello World");
        }
    }
}
