import java.util.*;
public class ThreeDigitNumberOrNot {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>99&&n<1000){
        System.out.println("The number is Three digit number");
    }
    else{
        System.out.println("The number is Not Three digit number");
    }
    }
}
