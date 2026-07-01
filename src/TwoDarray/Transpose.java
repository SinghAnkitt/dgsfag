package TwoDarray;
import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4},
                {7, 2, 1, 6},
                {5, 5, 4, 1},
                {3, 1, 8, 2}
        };
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }
    }
}
