package MultidimensionalArray;

public class Addition {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 4}, {4, 6, 1}, {8, 6, 3}};
        int[][] b = {{5, 6, 8}, {4, 0, 2}, {12, 5, 8}};
        int[][] c = new int[3][3];
        for(int i  = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i  = 0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
