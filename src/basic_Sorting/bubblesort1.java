// sort an array in descending order using bubble sort
package basic_Sorting;
import java.util.*;
public class bubblesort1 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 23, 2, -5, -23, 65, 90, 56};
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int swaps = 0;
            for(int j = 0; j < n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
