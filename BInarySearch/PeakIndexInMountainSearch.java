package BInarySearch;

public class PeakIndexInMountainSearch {
    public static void main(String[] args) {
        int[] arr={10,20,45,67, 80,33,29};
        int n=arr.length;
        int lo=1, hi=n-2;
        int peak =-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                peak=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            {
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
        }
        System.out.println(peak);
    }
}
