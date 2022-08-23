package string_practice;

public class Convert_IntegerToString {
    /**
     * valueOf method converts different types of values into String. By the help of
     * string valueOf() method, you can convert int to string, long to string
     *
     * @param value
     * @return String variable
     */
    //SecondWay
    public static String converToInteger(int value){
        String str=String.valueOf(value);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(converToInteger(30)+10);
        // it should concatenate.

    }
}
