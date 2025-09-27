package MultidimensionalArray;
//Write a program to store roll number and marks obtained by 4 students side by side in a matrix.
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] stud = new float[4][2];
        System.out.println("Enter your roll number and marks");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<2; j++){
                stud[i][j] = sc.nextFloat();
            }
        }
        for(int i = 0; i<4; i++){
            for(int j = 0; j<2; j++){
                System.out.print(stud[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
