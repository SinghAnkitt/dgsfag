package Loops;
import java.util.*;

public class evenHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
        }
        sc.close();
    }
}
