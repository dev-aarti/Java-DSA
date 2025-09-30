package StringBuilder;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = new String("Aarti");
        StringBuilder sb = new StringBuilder("Aarti Chauhan");
        System.out.println(sb);
        System.out.println(s);
        System.out.println(sb.length());
        StringBuilder x;
        sb.setCharAt(2, 'B');
        System.out.println(sb);
        StringBuilder cap = new StringBuilder(10); //capacity of StringBuilder
        System.out.println(cap.capacity());
//        input in StringBuilder
        StringBuilder a = new StringBuilder(sc.nextLine());
        System.out.println(a);

    }
}
