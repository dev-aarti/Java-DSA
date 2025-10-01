package Strings;
//Given tow strings s and t, reurn true if t is an anagram of s, and flase otherwise.
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(anagram(s,t));;
    }
    public static boolean anagram(String s , String t){
        if(s.length()!=t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);
        for( int i=0; i<a.length; i++){
            if(a[i]!=b[i]) return false;
        }
       return true;
    }
}
