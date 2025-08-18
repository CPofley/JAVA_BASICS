package DsaExample;

import java.util.Objects;

/**
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Input: s = "race a car"
 * Output: false
 *
 * Input: s = " "
 * Output: true
 */
public class TwoPointersExample {

    public static void main(String[] args){
        String input = "Chaitan t natiahc";

        //removing alpha numeric characters
        String updatedString = input.replaceAll("[^a-zA-Z]","").toLowerCase();
        System.out.println(updatedString);

        //converting updatedString to character array
        char aar[] = updatedString.toCharArray();

        //Pass this character array to a function and return true if input is palindrome else false.
        boolean result = isInputPalindrome(aar);
        System.out.println("is string palindrome :" +result);


    }
    private static boolean isInputPalindrome(char arr[]){

        //initialize two index(left,right)  with values 0 and ( length-1)
        int left = 0;
        int right = arr.length -1;

        //Base case of two pointers is (left index < right index)
        //iterate left and right index in while loop

        while(left < right){
             //comparing left index characters with right index characters
            //if left index character and right index character are not equal then the string is not a Palindrome
            //Hence returning False
            //if left index character and right index character are equal then increment left character index and decrement right character index
            if(!Objects.equals(arr[left],arr[right]))
                return false;

            left++;
            right--;
        }
        return true;

    }

}
