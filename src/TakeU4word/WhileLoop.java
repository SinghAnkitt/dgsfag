package TakeU4word;
// Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
//A no. ends with digit d if its last digit is d.
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sum = 0, count = 0, n = 0;
        while(count < 50){
            if(n % 10 == d){
                sum += n;
                count++;
            }
            n++;
        }
        System.out.println("Required sum is : " + sum);
    }
}
