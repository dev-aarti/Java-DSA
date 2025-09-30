package StringBuilder;
//Input a StringBuilder and toggle all the characters of it. (Replace small case with capital case & vice versa.
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        'A' = 65, 'B' = 66 ...'z'=90        'a' = 97, 'b' = 98,.....'Z' = 122
//        'a'-'A' = 32 'b'-'B' = 32
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i =0; i<n; i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                ascii+=32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
            else if(ascii>=97 && ascii<=122){
                ascii-=32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}
