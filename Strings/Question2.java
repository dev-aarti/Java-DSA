package Strings;
import java.util.*;
//Given a string consisting of lowercase English alphabets.Print the character that is occurring most number of times.
public class Question2 {
    public static void main(String[] args) {
//        Frequency Array
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        for(int i=0;i< s.length(); i++){
            char ch = s.charAt(i);
            int idx = (int)ch-97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for(int i =0; i<freq.length; i++){
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for(int i =0; i<freq.length; i++){
            if(freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.println(ch+" ");
            }
        }
    }
}
