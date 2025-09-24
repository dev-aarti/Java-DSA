package ArraysQues;

import java.util.Scanner;
//Find the second largest element in the given array.
public class SecondLargestElement {
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
        int secondMx = Integer.MIN_VALUE;
        for(int i =0; i<size; i++){
            if(arr[i]!=max){
                secondMx = Math.max(secondMx, arr[i]);
            }
        }
        System.out.println(max);
        System.out.println(secondMx);
    }
}
