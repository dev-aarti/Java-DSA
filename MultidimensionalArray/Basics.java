package MultidimensionalArray;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[3][3];
        int n = arr.length;
        System.out.println(n);
        int m = arr[0].length;//col of rows
        System.out.println(m);
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                System.out.print(arr[i][j] +" ");;
            }
            System.out.println();
        }
    }
}
