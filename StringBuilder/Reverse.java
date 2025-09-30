package StringBuilder;
//Take input a StringBuilder and reverse it without using builtin method
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String reverse = reverseMethod(sb);
        System.out.println("Original String: " + sb);
        System.out.println("Reversed String: " + reverse);

    }
    public static String reverseMethod(StringBuilder s){
        String reverse = " ";
        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            reverse+=ch;
        }
        return reverse;
    }
}
