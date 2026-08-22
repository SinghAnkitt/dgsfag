package Arrays;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 54, 20, -2, 453, 90, -3};
        for(int i = 0; i < arr.length; i++){
            int j = i;
        while(j > 0 && arr[j] < arr[j-1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
