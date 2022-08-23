package string_practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PracticeTasksOfStrings {
    public static Scanner input =new Scanner(System.in);
    public static Scanner input2 =new Scanner(System.in);
    public static void main(String[] args) {

        //firstAndLastCharOfSentence();
        //longestSentence();
        //checkFirstAndLastCharacterString();
        //System.out.println(initialsOfNames());
        //checkIfStringIsEmpty();
        middleOfSentence();

    }




    public static void firstAndLastCharOfSentence(){
        /*
        1. write a program that asks user to enter a sentence.
            then print the first & last characters of the sentence
         */

        System.out.println("Give me a sentence: ");
        String sentence = input.nextLine();
        String fAndLCharsOfSentences = sentence.charAt(0) + "." + sentence.toUpperCase().charAt(sentence.length() - 1);
        System.out.println("fAndLCharsOfSentences = " + fAndLCharsOfSentences);
    }
    public static void longestSentence(){
        /*
        2. write a program that asks user to enter two strings, and print out the
            longest string
         */
        System.out.println("give me first string");
        String sentence1=input.nextLine();
        System.out.println("give me second string");
        String sentence2=input.nextLine();
        if (sentence1.length()>sentence2.length()){
            System.out.println(sentence1);
        } else if (sentence1.length()==sentence2.length()) {
            System.out.println(sentence1+" is equal to "+ sentence2+" according to length of sentences");
        }else {
            System.out.println(sentence2);
        }

    }
    public static void checkFirstAndLastCharacterString(){
        /*
        3. write a program that can check if the first and last characters of the
        string are same
        ex:
            level
            output:
            same
         */
        System.out.println("Give me a string");
        String str=input.next();
        if (str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println("Same");
        }else{
            System.out.println("NOT Same");
        }
    }
    public static String initialsOfNames(){
        /*
        4. write a program that can return the initials of the user
            ex:
                cybertek
                school
                output:
                C.S
                Note: Pay attention to the example output
         */
        System.out.println("Give me  String");
        String str =input.nextLine();
        return str.toUpperCase().charAt(0)+"."+str.toUpperCase().charAt(str.lastIndexOf(" ")+1);
    }
    public static void checkIfStringIsEmpty(){
        /*
        5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three
        characters
        if the string has less than or equal 3 characters, print the
        string itself
         */
        String str=input.nextLine();
        if (str.isEmpty()){
            System.out.println("String is empty");
        } else if (str.length()>=3) {
            System.out.println(str.substring(str.length()-3,str.length())+" is that last 3 characters of string");

        }else{
            System.out.println(str+" is that string");
        }

    }
    public static void middleOfSentence(){
        System.out.println("give me a string: ");
        String str=input.nextLine();
        if(str.length()%2==1){
            if (str.charAt((str.length()/2))=='a'){
                System.out.println("Cool Word: "+ str);
            }else{
                System.out.println("okey word: "+ str);
            }
        }else{
            if (str.charAt(str.length()/2)=='a'||str.charAt(str.length()/2+1)=='a'){
                System.out.println("Cool Word "+ str);
            }else{
                System.out.println("okey word");
            }
        }
    }

}
