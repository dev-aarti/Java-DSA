package Strings;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to revers: ");
        String s = sc.nextLine();
        sc.close();
        String reverse = reverseString(s);
        System.out.println("Original String : "+ s);
        System.out.println("Reversed String : "+ reverse);
    }
    public static String reverseString(String s){
        String reverse = "";
        for(int i = s.length()-1; i>=0; i--){
            reverse+= s.charAt(i);
        }
        return reverse;
    }
}
