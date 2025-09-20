package Conditionals;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
//        even or odd number
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd");
    }

}
