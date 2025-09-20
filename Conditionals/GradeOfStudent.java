package Conditionals;
//Take input percentage of a student and print the Grade according to marks.
//81-100 very goog
//61-80 goog
//41-60 Average
//<= 40 Fail
import java.util.*;
public class GradeOfStudent {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  percentage: ");
        int n = sc.nextInt();
        if(n>=81){
            System.out.println("Very Good");
        }
        else if(n<=80&&n>=61){
            System.out.println("Good");
        } else if (n<=60 && n>=41) {
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
