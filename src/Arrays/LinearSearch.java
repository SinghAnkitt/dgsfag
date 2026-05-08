package Arrays;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {33, 9, 54, 60, 21, 41, 69, 65, 34, 16};
        System.out.print("Enter the integer you want to find : ");
        int target = sc.nextInt();
        int found = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = i;
                break;
            }
        }
        if(found != -1){
            System.out.print("Target exists in Array at index " +found);
        }else{
            System.out.print("Target does not exist");
        }
    }
}
