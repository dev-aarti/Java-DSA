package ArraysAndArrayList;
//Find the doublet in the Array whose sum is equal to the given value x. (Two sum).
public class DoubletInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,9,3,4,5,6,-2};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if((arr[i]+arr[j])==7){
                    System.out.println("the doublet is : " + arr[i] + " and " + arr[j]);

                }
            }
        }
    }
}
