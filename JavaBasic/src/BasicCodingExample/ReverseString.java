package BasicCodingExample;

import java.util.Scanner;

/**
 * @charAt: it returns a character in that particular index of a string
 * @toCharArray:it converts string to character array
 */
public class ReverseString {

    public static void main(String args[]){
        reverseStringWithCharAt("chaitanya");
        reverseStringWithToCharArray("Sankalp");

    }
    private static void reverseStringWithCharAt(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1 ; i>=0;i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb);
    }
    private static void reverseStringWithToCharArray(String input){
        //toCharArray:it converts string to character array
        char inputArr[] = input.toCharArray();
        for(int i = inputArr.length-1;i>=0;i--){
            System.out.print(inputArr[i]);
        }
    }
}
