package string_practice;

import java.util.Arrays;

public class CountOfPossibleDistinctStrings {
    /*
    Count of substrings having all distinct characters
    Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
        Examples:
            Input: Str = “gffg”
            Output: 6
    Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
        Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
            Input: str = “gfg”
            Output: 5
    Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
        Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
     */
    public static int countOfSubstring(String str) {
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String temp = str.substring(i, j + 1);
                System.out.println(temp);
                boolean isDistinct = true;
                char[] ch = temp.toCharArray();

                Arrays.sort(ch);
                for (int k = 0; k < ch.length - 1; k++) {
                    if (ch[k] == ch[k + 1]) {
                        isDistinct = false;
                    }

                }
                if (isDistinct) {
                    count1++;
                }
            }

        }

        return count1;

    }

    public static void main(String[] args) {
        System.out.println("Count of Substring: "+countOfSubstring("gffg"));
    }
}
