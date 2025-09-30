package StringBuilder;

public class AppendFun {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABC");
        s.append("XYZ");
        System.out.println(s);
        char[] ch = {'a', 'b', 'c'};
        s.append(ch);
        System.out.println(s);
    }
}
