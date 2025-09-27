package ArraysAndArrayList;

public class SortOf0sn1sM2 {
    public static void main(String[] args) {
        int[] brr = {1,1,0,0,1,0};
//        method 2
        int n = brr.length;
        int i=0, j=n-1;
        while(i<=j){
            if(brr[i]==0) i++;
            else if(brr[j]==1) j--;
            else if(brr[i]==1&&brr[j]==0){
                brr[i] = 0;
                brr[j] = 1;
                i++;
                j--;
            }

        }
        System.out.println();
        for(int ele: brr){
            System.out.print(ele+" ");
        }
    }
}
