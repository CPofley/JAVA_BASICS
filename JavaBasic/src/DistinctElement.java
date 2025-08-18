import java.util.Arrays;

public class DistinctElement {

    //[1,1,2]
//Find count of distinct elements from the given array
    public static void main(String[] args) {
        int arr[] ={1,2,1};
        int distinctEleCount = getDistinctElementCount(arr);
        System.out.println("Distinct element count in an array is : "+distinctEleCount);

    }

    private static int getDistinctElementCount(int arr[]){
        int count = 1;
        Arrays.sort(arr);
        if(arr.length == 0)
            return 0;
        if(arr.length == 1)
            return count;

        for(int i = 1;i<arr.length;i++){

            if(arr[i] != arr[i-1])
                count++;

        }
        return count;

    }

}
