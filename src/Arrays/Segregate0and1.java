package Arrays;
import java.util.*;

public class Segregate0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        int size = arr.length;
        int zeroCount = 0;
        int oneCount = 0;
        for(int ele : arr){
            if(ele == 0){
                zeroCount++;
            } if(ele == 1){
                oneCount++;
            }
        }
        for(int i = 0; i < zeroCount; i++){
            arr[i] = 0;
        }for(int i = zeroCount; i < arr.length; i++){
            arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
