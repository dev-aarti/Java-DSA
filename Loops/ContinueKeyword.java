package Loops;

public class ContinueKeyword {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%2!=0){
                System.out.println(i+"  ");
            }
        }
//        50 iterations
//        for(int i = 1; i<=100; i+=2){
//                System.out.println(i+"  ");
//
//        }
//    continue
        System.out.println();
        for(int i = 1; i<=100; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

    }
}
