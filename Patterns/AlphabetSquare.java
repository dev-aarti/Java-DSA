package Patterns;

public class AlphabetSquare {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print( (char)(j+64) + " ");
            }
            System.out.println();
        }
//output
//        A B C D
//        A B C D
//        A B C D
//        A B C D
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print( (char)(i+64) + " ");
            }
            System.out.println();
        }
//        output
//        A A A A
//        B B B B
//        C C C C
//        D D D D
    }
}
