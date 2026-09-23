package Functions;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("The Sum is : " + ans);
        greetings();
    }

    static int sum(){
        Scanner sc = new Scanner(System.in);
        // Take 2 inputs and find the sum
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        int sum = n1+n2;
        return sum;
    }
    static void greetings(){
        System.out.println("This is void Function");
    }
}
