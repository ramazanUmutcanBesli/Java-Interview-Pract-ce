package string_practice;

import java.util.Arrays;

public class Anagram_String {
    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */
    /**
     * Anagram is mean that a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.
     * usage method is toCharArray. it convert string to char array
     * sort is coming from java.utl.Arrays class it is sorted lower to bigger.
     * @param a
     * @param b
     * @return boolean
     */
    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        for (char c : ch1) {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println(ch1);
        System.out.println(ch2);
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (char c : ch1) {
            System.out.print(c+ " ");
        }
        System.out.println(ch1);
        System.out.println(ch2);
        String a1 = "", a2 = "";
        for (char c : ch1) {
            a1 += c;
        }
        for (char c : ch2) {
            a2 += c;
        }
        return a1.equals(a2);
    }

    public static void main(String[] args) {
        System.out.println(same("metin", "nimet"));
    }
}
