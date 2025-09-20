package Conditionals;
//Take 3 numbers input and tell if they can be the sides of a triangle.

import java.util.*;
public class TriangleOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of triangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the second side of triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the third side of triangle: ");
        int c = sc.nextInt();

        if(a+b>c && b+c >a && c+a > b){
            System.out.println("This is a triangle");
        }
        else {
            System.out.println("Not a triangle");
        }
    }
}
