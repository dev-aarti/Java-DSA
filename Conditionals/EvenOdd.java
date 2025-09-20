package Conditionals;
import java.util.*;
//Take positive integer input and tell if it is even or odd
public class EvenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Number: ");
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println("Entered Integer is a Even Number");
        }
        else{
            System.out.println("Entered Integer is a Odd Number");
        }
    }
}
