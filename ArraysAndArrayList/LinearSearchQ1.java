package ArraysQues;
//Find the element 'x' in the array. Take array and x as input. 0
import java.util.*;
public class LinearSearchQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int x = sc.nextInt();
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i  = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i  = 0; i < size; i++){
            if(arr[i]==x){
                flag = true;
                break;
            }

        }
        if (flag == true) {
            System.out.println("Target found");
        }
        else{
            System.out.println("Target not found");
        }
    }
}
