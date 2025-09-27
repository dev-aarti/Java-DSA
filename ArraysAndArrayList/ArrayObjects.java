package ArraysAndArrayList;

class Sample {
    private int i;
    private float a;

    public Sample(int ii, float aa) {
        i = ii;
        a = aa;
    }

    public void display() {
        System.out.println("i =" + i + " aa = " + a);
    }
}

public class ArrayObjects {
    public static void main(String[] args) {
        Sample[] arr = new Sample[3];
        arr[0] = new Sample(2, 3.0f);
        arr[1] = new Sample(4, 3.14f);
        arr[2] = new Sample(2, 4.5f);

        for (Sample s : arr) {
            s.display();
        }
    }
}
