package ArraysAndArrayList;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr ={2, 4, 5, 31};
        int[] brr ={9,12,18,21};
        int a = arr.length;
        int b = brr.length;
        int[] crr = new int[a+b];
        int i=0, j=0, k;
        for( k=0; k<a+b; k++){
            if(i<a&&j<b){
                if(arr[i]<=brr[j]){
                    crr[k] = arr[i];
                    i++;
                }
                else{
                    crr[k] = brr[j];
                    j++;
                }
            }
            else if( i==a){
                crr[k] = brr[j];
                j++;
            }
            else{
                crr[k] = arr[i];
                i++;
            }
        }
        for(int ele: crr){
            System.out.print(ele+" ");
        }
    }
}
