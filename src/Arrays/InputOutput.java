package Arrays;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Double of the numbers entered are : ");
        for(int i = 0; i < n; i++){
            System.out.print(2*arr[i]+" ");
        }
    }
}
