package ArraysAndArrayList;
//Write a program to reverse the array without using any extra array.(Two pointer)
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,5,9,3,4,5,6,-2};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int n = arr.length, temp;
//        for(int i = 0; i<n/2; i++){
//            int j = n-1-i;
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        using while loop
        int i=0, j=n-1;
        while(i<=j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
