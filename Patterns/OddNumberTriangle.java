package Patterns;

public class OddNumberTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=n; i++){
            int k=1;
            for(int j = 1; j <= i; j++){
                System.out.print((k)+" ");
                k+=2;
            }
            System.out.println();
        }
    }
}
