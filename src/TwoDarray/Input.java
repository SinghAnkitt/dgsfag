package TwoDarray;
import java.util.*;

public class Input {
    public static void main(String[] args){
        int[][] arr = { {23,42,54,}, {32,9,78,1}, {233,76,22,14} };
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
