package BInarySearch;

public class Bs {
    public static void main(String[] args) {
        int[] arr={10,23,28,46,89,91,97,107,140,264};
        int target = 46;
        int n =arr.length;
        boolean flag = false;

        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]>target){
                hi = mid-1;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
        }
        if(flag==true) System.out.println("Target Present");
        else System.out.println("Target not found");
    }
}
