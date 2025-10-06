package Sorting;
//Given an array with N distinct elements, convert the given array to a form wherer all elments are in the range from 0 to N-1. The order of elements is the same, i.e,0 is placed
//in the place of the smallest element, 1 is placed for the second smallest element, ...N-1 is placed for the largest element.
public class Ques1 {
    public static void printArray(int[] arr){
        for(int ele: arr){
            System.out.print(ele+"  ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={40,12,78,34,100,57,23};
        int n = arr.length;
        int x =0;
        printArray(arr);
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=0; j<n; j++){
                if(arr[j]<min&&arr[j]>0){
                    min =arr[j];
                    mindx =j;
                }
            }
            arr[mindx] =x;
            x--;
        }
        System.out.println();
        printArray(arr);
        System.out.println();
        for(int i =0 ; i<n; i++){
            arr[i] *=(-1);
            System.out.print(arr[i]+"  ");
        }
    }
}
