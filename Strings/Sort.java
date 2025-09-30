package Strings;
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        String s = "Aarti";
//        char[] ch ={'A', 'a', 'r', 't', 'i'};
        char[] ch = s.toCharArray();
        for(char ele: ch){
            System.out.println(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele: ch){
            System.out.println(ele);
        }
        System.out.println();

    }
}
