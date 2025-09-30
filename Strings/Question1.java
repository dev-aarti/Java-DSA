package Strings;
//Input a string and Update all the even positions in the string to character 'a'. Consider 0-based indexing.
public class Question1 {
    public static void main(String[] args) {
        String s = "Abhishek";
        String str = "";
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                str+='a';
            }
            else{
                str += s.charAt(i);
            }
        }
        s = str;
        System.out.println(s);
    }
}
