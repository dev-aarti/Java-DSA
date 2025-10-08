package BInarySearch;

public class SquareRoot {
    public static void main(String[] args) {

        long x=24;
        long lo=0, hi=x;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid==x){
                System.out.println(mid);
                break;
            }
            else if(mid*mid>x) hi =mid-1;
            else lo=mid+1;
        }
    }
}
