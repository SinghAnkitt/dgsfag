package Arrays;
import java.util.*;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a = 4; // 4 bytes leta hai
        int[] arr = {32, 89, 98, 33, 11}; // 20 bytes lega and contiguous
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);
        int[] y = Arrays.copyOf(arr, arr.length); // deep copy
        y[0] = 200;
        System.out.println(arr[0]);
        System.out.println(y[0]);
    }
}
