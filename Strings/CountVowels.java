package Strings;
import java.util.*;
public class CountVowels {
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'|| ch=='I' ||ch=='o' ||ch=='O' || ch=='u' ||ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s= sc.nextLine();
        int n= s.length();
        int count = 0;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }
}
