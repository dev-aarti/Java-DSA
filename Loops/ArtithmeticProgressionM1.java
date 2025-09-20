package Loops;
//Display this Ap - 1, 3, 5, 7, 9.. upto 'n';
import java.util.*;
public class ArtithmeticProgressionM1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n Terms: ");
    int n = sc.nextInt();

//    for(int i = 1; i<=(2*n-1); i+=2){
//        System.out.println(i);
//    }

    for(int i = 4; i<=(3*n+1); i+=3){
        System.out.println(i);
    }
    }
}
