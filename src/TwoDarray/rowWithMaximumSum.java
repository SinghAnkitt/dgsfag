package TwoDarray;
import java.util.*;
// find row with maximum sum
public class rowWithMaximumSum {
    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,40},{3,1,8,2,6}};
        int row = arr.length;
        int col = arr[0].length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < col; j++){
                sum += arr[i][j];
            }
            if(sum>max){
                max = sum;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
