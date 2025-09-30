package StringBuilder;
import java.util.*;
public class ReverseEachWordInSentence {
    public static void reverseString(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i =0, j=0;
        while(j<n){
            if(sb.charAt(j)!=' ') j++;
            else{
                reverseString(sb, i, j-1);
                i = j+1;
                j=i;
            }
        }
        reverseString(sb, i, j-1);
        System.out.println(sb);
    }

}
