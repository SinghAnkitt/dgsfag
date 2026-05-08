package Arrays;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {32, 76, 34, 49, 23, 245,12, 119, 45};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of d : ");
        int d = sc.nextInt();
        reverse(arr, 0 , d-1);
        reverse(arr, d , n-1);
        reverse(arr, 0 , n-1);
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void reverse(int[] arr, int i, int j){
        while(j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
