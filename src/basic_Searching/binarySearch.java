package basic_Searching;
import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-2, 0, 4, 9, 12, 43, 98, 101, 230, 1222};
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                index = mid;
                break;
            }
        }
        System.out.println(target +" found at index : " + index);
    }
}
