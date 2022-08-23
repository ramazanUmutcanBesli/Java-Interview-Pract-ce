package string_practice;

public class HashCodeOfStrings {
    public static void main(String[] args) {
        hashCodeOfString("Welcome");


    }
    public static int hashCodeOfString(String str){
        int hashCode=str.hashCode();
        System.out.println("String str hash code is: "+hashCode);
        return hashCode;
    }

}
