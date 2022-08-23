package string_practice;

import java.util.InputMismatchException;

public class Convert_StringToInteger {
    /**
     * Write a program that can convert a string to integer.
     * DO NOT use parse or valueOf Methods
     *
     * @param str
     * @return int
     */
    public static int convertToInteger(String str){
        int result =0;
        int factorTo10=1;
        try {
            for (int i=str.length()-1;
                 str.startsWith("-")?i>0:i>=0;
                 i--){
                char each=str.charAt(i);
                result+=(each-'0')*factorTo10;
                factorTo10*=10;
            }
        }catch (InputMismatchException e){
            return 0;
        }
        return result;
    }

    /**
     * parseInt() this returns an integer .it only takes number of string like "10"
     * @param str
     * @return int
     */
    public static int convertToIntegerByParseInt(String str){
        int result=Integer.parseInt(str);
        return result;
    }
    public static void main(String[] args){
        System.out.println(convertToInteger("a"));
        System.out.println(convertToIntegerByParseInt("a"));

    }

}
