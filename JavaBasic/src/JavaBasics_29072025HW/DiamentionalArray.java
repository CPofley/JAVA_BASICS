package JavaBasics_29072025HW;

import java.util.Arrays;
import java.util.Random;

/**
 * @3DARRAY :In any Diamentional array 1st array size is ntg but the original size of that particular array
 * E.g: int threeArray[][][] =new int[2][3][4];
 * 2 : size of threeArray array
 * 3 : size of  2d array
 * 4 : size of 1d array
 */

public class DiamentionalArray {

    public static void main(String args[]){

        int threeArray[][][] =new int[2][3][4];   //SIZE =2

        System.out.println("Size of three D array: " + threeArray.length);

        int twoArray[][] = threeArray[0];
        System.out.println("Size of 2D array:"+twoArray.length);

        int oneArray1[] = twoArray[0];
        int oneArray2[] = twoArray[1];
        System.out.println("Size of 1D array:"+oneArray2.length);

        Random rand = new Random();

        for(int i = 0;i < threeArray.length;i++){
            int arrayTwo[][] = threeArray[i];
            for(int j =0; j < arrayTwo.length;j++){
                int arrayOne[] = arrayTwo[j];
                for(int y=0;y < arrayOne.length;y++){
                    arrayOne[y] = rand.nextInt(100);
                }
                System.out.println(Arrays.toString(arrayOne));

            }
        }

    }
}
