package Arrays;
import java.util.*;

public class GreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.print("Greatest element of the given array is : " +max);
    }
}
