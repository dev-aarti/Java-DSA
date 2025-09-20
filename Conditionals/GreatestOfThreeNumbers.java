package Conditionals;
//Take 3 positive integers input and print greatest of them.
import java.util.*;
public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the First Number");
        a = sc.nextInt();
        System.out.println("Enter the Second Number");
        b = sc.nextInt();
        System.out.println("Enter the Third Number");
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is Greatest Number");
        } else if (b>a && b>c) {
            System.out.println(b + " is Greatest Number");
        }
        else{
            System.out.println(c + " is Greatest Number");

        }
    }
}
