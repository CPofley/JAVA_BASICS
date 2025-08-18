package BasicCodingExample;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Find lowest price index of stock = lowIndex
 * 2. Check if 'lowIndex'+1 < prices.length ? Iterate from  'lowIndex+1' till prices.length : return 0
 * 3. Check if nexHighPrice - lowestPrice > maxProfit ? (store) maxProfit = nexHighPrice - lowestPrice
 * 4. return maxProfit
 */
public class MaximumProfit {
    public static void main(String[] args) {
        int prices[] = new int[8];
        int maxProfit = getMaxProfit(prices);
        System.out.println("Maximum profit is: " +maxProfit);

    }
    private static int getMaxProfit(int prices[]){
        Random rand = new Random();
        for(int i = 0;i<prices.length;i++){
           prices[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(prices));

        int lowestPrice = prices[0];
        int lowestIndex = 0;
        int maxProfit =0;

        for(int i =1;i<prices.length;i++) {  //[46, 3, 78, 40, 92, 78, 84, 95]--input
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];   // 3--price
                lowestIndex = i;           //1--index
            }
        }


            if((lowestIndex +1) <prices.length){
                for(int i = lowestIndex+1;i<prices.length;i++){
                    if((prices[i] - lowestPrice) > maxProfit){
                        maxProfit = prices[i] - lowestPrice;
                    }
                }
            }
            return maxProfit;





    }
}

