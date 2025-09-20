package Conditionals;
//Take integer input and print the absolute value of that integer
import java.util.Scanner;
public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Number: ");
        int a = sc.nextInt();
        if(a<0){
            System.out.println(-a);
        }
        else{
            System.out.println(a);
        }
    }
}
