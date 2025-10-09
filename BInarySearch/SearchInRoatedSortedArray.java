package BInarySearch;

public class SearchInRoatedSortedArray {
    public static void main(String[] args) {
        int[] arr={91,97,97,107,140,264,10,23,46,46};
        int n = arr.length;
        int target= 140;
        int lo =0,hi=n-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(arr[mid]==target) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<=arr[hi]){
                if(target>=arr[mid]&& target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
            else {
                if(target>=arr[lo]&& target<arr[mid]) hi=mid-1;
                else lo=mid+1;
            }

        }
    }
}
