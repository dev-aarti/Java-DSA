package Sorting;

public class BubbleSortDecreasing {
    public static void main(String[] args) {
        int[] arr ={1, 7, 3, 8, 2,12};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]  =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
