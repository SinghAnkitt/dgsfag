package Arrays;
import java.util.*;

public class Swapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {34, 54, 34, 344, 98};
        int i = 0;
        int j = arr.length-1;
        int temp = arr[0];
        arr[0] = arr[j];
        arr[j] = temp;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        while(i < j){
            int emp = arr[i];
            arr[i] = arr[j];
            arr[j] = emp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
