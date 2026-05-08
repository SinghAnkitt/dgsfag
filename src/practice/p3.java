package practice;
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n + 64;
        for(int i = 65; i <= m; i++){
            for(int j = 65; j <= m; j++){
                System.out.print((char)j +" ");
            }
            System.out.println();
        }
    }
}
