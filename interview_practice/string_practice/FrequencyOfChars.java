package string_practice;

public class FrequencyOfChars {
     /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static String frequencyOfchar(String str){
        String expectedResult="";
        int j=0;
        while (j<str.length()){
            int count=0;
            for (int i =0;i<str.length();i++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            expectedResult+=str.charAt(j)+""+count;
            str=str.replace(""+str.charAt(j),"");
        }
        return expectedResult;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfchar("AAABBCDD"));
    }
}
