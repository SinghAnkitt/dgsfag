package Arrays;
import java.util.*;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 6, 2, 4};
        int n = arr.length + 1;
        long totalSum = (long)n*(n+1)/2;
        long sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        int ans = (int)(totalSum - sum);
        System.out.println(ans);
    }
}
