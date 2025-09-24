package Arrays;
//Find the maximum value out of all the elements in the array.
import java.util.*;
public class MaximumEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i  = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
//        int max =arr[0];
          int max = Integer.MIN_VALUE;
        for(int i = 0; i<size; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
