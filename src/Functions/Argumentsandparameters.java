package Functions;
import java.util.*;

public class Argumentsandparameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int totalSum = sum(a, b);
        sc.nextLine();
        System.out.print("Enter the name ");
        String name1 = sc.nextLine();
        String greet = personalized(name1);
        System.out.println(totalSum);
        System.out.println(greet);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static String personalized(String name){
        String message =  "How are you " + name;
        return message;
    }
}
