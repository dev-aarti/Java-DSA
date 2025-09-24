package ArraysQues;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr ={120,50,41,32,12,1,52};
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
//        for(int i = 1; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        forEach loop
        for(int x : arr){
            System.out.println(x);
        }
    }
}
