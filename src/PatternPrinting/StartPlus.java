package PatternPrinting;
import java.util.*;

public class StartPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int mid = (1+m)/2;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m; j++){
                if(i == mid || j == mid){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
