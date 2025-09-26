package ArraysQues;
//Rotate the given array 'a' by k steps, where k is non - negative
//j can be greater that n as well as where n is the size of array 'a'.
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,12,3,21,54,92,31,5};
        rotate(arr,4);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static void reverse(int[] nums, int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] =nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
}
