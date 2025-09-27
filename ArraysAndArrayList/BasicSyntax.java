package ArraysAndArrayList;

public class BasicSyntax {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 56, 3, 1, 2};
        int x = 5;
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[2]);
        arr[0] = 90;
        arr[0] += 10;
        System.out.println(arr[0]);
//        arr[5] = 40;
//        System.out.println(arr[5]);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}