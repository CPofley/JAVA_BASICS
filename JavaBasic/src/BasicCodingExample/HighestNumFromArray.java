package BasicCodingExample;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Step1:pass empty array of size 10 to a function
 * Step2:add 10 RANDOM integers to an empty array
 * Step3:Check if input array is null then  return 0
 * 3.1: Check if input array size is == 1 then return 0th index element
 * 3.2: Store 0th index element as int highestNum
 * Step4: iterate array from 1st index till length of an array
 * 4.1:Check if every index is > highestNum then replace highestNum with that index value.
 * Step5:Return highestNum
 */
public class HighestNumFromArray {
    public static void main(String[] args) {

        int nums[] = new int[10];
        int highestNum = getHighestNumber(nums);
        System.out.println("Highest number of array is: " +highestNum);
    }

    private static int getHighestNumber(int[] nums) {
        Random rand = new Random();
        for(int i = 0;i< nums.length;i++){
            nums[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
         if(Objects.isNull(nums))
             return 0;
         if(nums.length == 1)
             return nums[0];
         int highestNum = nums[0];
         for(int i =1;i< nums.length;i++){
             if (nums[i] > highestNum)
                 highestNum = nums[i];
         }
         return highestNum;

    }
}
