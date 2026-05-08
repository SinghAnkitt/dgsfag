package Loops;
import java.util.*;

public class ReverseIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Integer : ");
        int n = sc.nextInt();
        int r = 0;
        while(n != 0){
            r *= 10;
            r += (n % 10);
            n /= 10;
        }
        System.out.println(r);
    }
}
