package MultidimensionalArray;
//
import java.util.Scanner;
public class LargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                mx = Math.max(mx, arr[i][j]);
            }
        }
        System.out.println("Largest Element is : - "+mx);
    }
}
