package Loops;
//wap to check if a number is composite or not.
import java.util.*;
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;  //0 means prime
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                System.out.println(n + " is a composite number");
                x = 1; // 1 means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
        else if(x==0) System.out.println("Prime Number");
    }
}
