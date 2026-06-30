package TwoDarray;
// maximum element in 2d array
import java.util.*;

import java.util.*;
public class p1 {
    public static void main(String[] args) {
        int[][] arr = {
                {2,8,3,4,7},
                {7,2,1,6,3},
                {5,5,4,11,4},
                {3,1,8,2,6}
        };
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                max = Math.max(arr[i][j], max);
            }
        }
        System.out.println("Maximum element present in the array : " + max);
    }
}
