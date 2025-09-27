package ArraysAndArrayList;

public class Sort0s1s2sM2 {
//    (Dutch Flag Algorithm)- one pass
    public static void main(String[] args) {
        int[] arr ={0,1,0,2,1,2,0,2,0};
        int n = arr.length;
        int mid=0, high = n-1, low=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] =arr[low];
                arr[low] = temp;
                low++; mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] =arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
