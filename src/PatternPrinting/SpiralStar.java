package PatternPrinting;
import java.util.*;

public class SpiralStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] mat = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(mat[i], ' ');

        int top = 0, bottom = n-1, left = 0, right = n-1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                mat[top][i] = '*';
            }
            top++;
            for(int i = top; i <= bottom; i++){
                mat[i][right] = '*';
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    mat[bottom][i] = '*';
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    mat[i][left] = '*';
                }
                left++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
