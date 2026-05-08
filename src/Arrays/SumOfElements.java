package Arrays;
import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i <n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of the elements of the given array is : " +sum);
    }
}
