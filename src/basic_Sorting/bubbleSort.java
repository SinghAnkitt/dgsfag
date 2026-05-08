package basic_Sorting;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
//            boolean isSorted = true;
//            for(int j = 0; j < n-1; j++){
//                if(arr[j] > arr[j+1]){
//                isSorted = false;
//                break;
//                }
//            }
//            if(isSorted == true) break;
            int swaps = 0;
            for(int j = 0; j < n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
