package Loops;
import java.util.*;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer  :");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            int on = n % 10;
            sum += on;
            n /= 10;
        }
        System.out.println("Sum of the digits of given integer is : " +sum);
    }
}
