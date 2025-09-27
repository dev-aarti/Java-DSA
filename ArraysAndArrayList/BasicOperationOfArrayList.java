package ArraysAndArrayList;

import java.util.ArrayList;

public class BasicOperationOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 6);
        arr.add(1, 10);
        arr.add(2, 16);
        arr.add(3, 52);
        arr.add(4, 45);
        arr.set(2, 200);
        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println();
        arr.remove(1);
        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
