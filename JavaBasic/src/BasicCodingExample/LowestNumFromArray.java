package BasicCodingExample;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class LowestNumFromArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int lowestNum = getLowestNum(arr);
        System.out.println("Lowest number of array is : "+lowestNum);
    }
    private static int getLowestNum(int[] arr) {
        if(Objects.isNull(arr))
            return 0;
        if(arr.length ==1)
            return arr[0];
        Random rand = new Random();
        for(int i = 0;i< arr.length;i++){
         arr[i] =  rand.nextInt(500) ;
        }
        System.out.println(Arrays.toString(arr));

        int lowestNum = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(arr[i] < lowestNum )
                lowestNum = arr[i];
        }
        return lowestNum;
    }
}
