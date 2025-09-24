package Arrays;
//Given an array of marks of students, if the mark of any student is less than 35 print its roll number. [roll number here referes to the index of the array.
public class Question1 {
    public static void main(String[] args) {
        int[] marks = {45, 90, 67, 99, 34, 56, 12};
        System.out.println("Roll number of the students whose marks is less than 35 :- ");
        for(int i = 0; i<marks.length; i++){
            if(marks[i]<35){
                System.out.println(i);
            }
        }
    }
}
