package BInarySearch;

public class FindFirstAndLastElement {
    public static void main(String[] args) {
        int[] arr={10,23,46,46,46,46,97,107,140,264};
        int target =46;
        int n=arr.length;
        int[] ans = new int[2];
        int lo, hi;
        int fp =-1;

        // first position
        lo=0; hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]) hi=mid-1;
                else{fp =mid; break;}
            }
            else if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]>target) hi=mid-1;
        }
        // last position
        lo=0;
        hi=n-1;
        int lp=-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target){
                if(mid+1<n && arr[mid]==arr[mid+1]) lo=mid+1;
                else{lp =mid; break;}
            }
            else if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]>target) hi=mid-1;
        }
        System.out.println(ans[0]=fp);
        System.out.println(ans[1]=lp);
    }
}
