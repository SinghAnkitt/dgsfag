package Arrays;
import java.util.*;

public class SecondMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 92, 222, 88, 12, 88, 222, 91, 2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] != max) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
