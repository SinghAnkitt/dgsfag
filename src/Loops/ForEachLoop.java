package Loops;
import java.util.*;
public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {2, 9238, 293, 20, 222, 1};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
