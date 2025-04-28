import java.util.*;

public class PowerOfAnother {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        System.out.println(power);
    }
}
