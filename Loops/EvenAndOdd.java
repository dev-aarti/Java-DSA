package Loops;
//Print all the even  numbers from 1 to 100
//Print all the odd  numbers from 1 to 100
public class EvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Even Numbers");
        for(int i = 1; i <= 100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("odd Numbers");
        for(int i = 1; i <= 100; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

}
