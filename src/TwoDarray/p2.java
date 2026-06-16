package TwoDarray;
//Find the minimum element out of all the maximum elements in each row

import java.util.*;
public class p2 {
    public static void main(String[] args) {
        int[][] arr = {
                {2,8,3,4,7},
                {7,2,1,6,3},
                {5,5,4,1,4},
                {3,1,8,2,6}
        };
        int rowMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            int rowMax = Integer.MIN_VALUE;
            for(int j = 0; j < arr[0].length; j++){
                rowMax = Math.max(rowMax, arr[i][j]);
            }
        rowMin = Math.min(rowMin, rowMax);
        }
        System.out.println(rowMin);
    }
}
