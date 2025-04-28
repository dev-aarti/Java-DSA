import java.util.*;
public class TypeOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of Triangle");

        System.out.print("AB:");
        int ab = sc.nextInt();

        System.out.print("BC:");
        int bc = sc.nextInt();

        System.out.print("CA:");
        int ca = sc.nextInt();

        if(ab==bc && bc==ca)
        {
        System.out.println("The Triangle is Equilateral");
        }
        else if (ab==bc||bc==ca||ab==ca) {
            System.out.println("The Triangle is isosceles");
        }
        else{
            System.out.println("The Triangle is Scalene");
        }
    }
}
