package Conditionals;
//Write a program to create a calculator that performs basic arithmetic operations (add, subtract, multiply and divide) using switch case and functions. The calculator should input two numbers and an operator from user.
import java.util.*;
public class CalculatorIfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

        if(op== '+') System.out.println(a+b);
        if(op== '-') System.out.println(a-b);
        if(op== '*') System.out.println(a*b);
        if(op== '/') System.out.println(a/b);
    }
}
