package Strings;
//input a string and print all the substring of that string.
public class printAllSubStrings {
    public static void main(String[] args) {
        String s = "Aarti";
        for(int i=0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                System.out.print(s.substring(i, j)+"  ");
            }
            System.out.println();
        }
    }
}
