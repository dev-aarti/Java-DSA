import java.util.Scanner;

public class AreaPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle");
        float length = sc.nextFloat();
        System.out.println("Enter the Width of the Rectangle");
        float width = sc.nextFloat();

        float perimeter = 2 * (length + width);
        float area = length * width;

        System.out.println("The perimeter of rectangle is " + perimeter);
        System.out.println("The area of rectangle is " + area);

        if (perimeter > area) {
            System.out.println("The Perimeter of the Rectangle is greater than Area of Rectangle");
        } else {
            System.out.println("The Area of the Rectangle is greater than Perimeter of Rectangle");
        }
    }
}
