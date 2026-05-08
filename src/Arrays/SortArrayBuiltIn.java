package Arrays;
import java.util.*;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // for ascending order
        int[] arr = {23, 75, 1, 98, -4, 93, -22, -99, 9};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
