
public class ArrayReference {

    public static void main(String[] args) {
        int[] marks = { 12, 45, 9, 88, 50 };

        modify(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }

    static void modify(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
