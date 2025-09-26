package ArraysQues;

public class SortArrayOf0sn1s {
    public static void main(String[] args) {
//        int[] arr = {1,1,0,0,1,0,1,0,1,1};
//        int n = arr.length;
//        int noOfZeroes = 0, noOfOnes = 0;
//        for(int i = 0; i<n; i++){
//            if(arr[i]==0) noOfZeroes++;
//
//        }
////        for(int i = 0; i<noOfZeroes; i++){
////            arr[i] = 0;
////        }
//        for(int i = 0; i<n; i++){
//            if(i<noOfZeroes) arr[i] =0;
//            else arr[i] =1;
//        }
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }

        int[] brr = {1,1,0,0,1,0,1,0,1,1};
//        method 2
        for(int ele: brr){
            System.out.print(ele+" ");
        }
        int n = brr.length;
        int i=0, j=0;
        while(i<=j){
            i=0;
            j=n-1;
            if(brr[i]==0) i++;
            if(brr[j]==1) j--;
            if(brr[i]==1&&brr[j]==0){
                int temp = brr[i];
                brr[i] = brr[j];
                brr[j] = temp;
                i++;
                j--;
            }

        }
        for(int ele: brr){
            System.out.print(ele+" ");
        }
    }
}
