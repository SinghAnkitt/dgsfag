package Loops;
import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int pow = 1;
        for(int i = 1; i <= b; i++){
            pow  *= a;
        }
        System.out.println(pow);
    }
}
