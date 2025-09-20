package Loops;
//Display this Gp - 1, 2, 4, 8, 16, 32.. upto 'n' terms.
import java.util.*;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Terms: ");
        int n = sc.nextInt();
        int a = 1;
        for(int i = 1; i<= n; i++){
            System.out.println(a);
            a*=2;
        }
    }
}
