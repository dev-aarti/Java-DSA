package ArraysQues;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] nums = arr; //shallow Copy
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();


//        deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        for(int ele: brr){
            System.out.print(ele+" ");
        }
        System.out.println();
        brr[0] =70;
        for(int ele: brr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(arr[0]);
    }
}
