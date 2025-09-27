package MultidimensionalArray;

public class Rotate90Deg {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 4}, {4, 6, 1}, {8, 6, 3}};

        for(int i  = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(a[j][i]+"  ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i  = 0 ; i<3; i++){
            for(int j = 0; j<i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i  = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(a[j][i]+"  ");
            }
            System.out.println();
        }
        System.out.println();
//        rotate
        for(int i = 0; i<3; i++){
            int n = 0, m=n-1;
            //swap
            while(n<m){
                int temp = a[i][n];
                a[i][n] = a[i][m];
                a[i][m] = temp;
                n++;
                m--;
            }
        }
        for(int i  = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
