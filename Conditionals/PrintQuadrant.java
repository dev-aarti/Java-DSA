package Conditionals;
//Given a point(x,y), write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th Quadrant, on the x-axis, y-axis or at the origin , viz(0,0).
import java.util.*;
public class PrintQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-axis: ");
        int x = sc.nextInt();
        System.out.println("Enter the y-axis: ");
        int y = sc.nextInt();

        if(x>0 && y>0) System.out.println("1st Quadrant");
        else if (x<0 && y>0) System.out.println("2nd Quadrant");
        else if(x<0 && y<0) System.out.println("3rd Quadrant");
        else if(x>0 && y<0) System.out.println("4th Quadrant");
        else if(x==0 && y==0) System.out.println("At the Origin");
    }
}
