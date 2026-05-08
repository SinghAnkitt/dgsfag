package Basics;
import java.util.*;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the princple amount : ");
        int p = sc.nextInt();
        System.out.print("Enter the rate : ");
        int r = sc.nextInt();
        System.out.print("Enter the time given : ");
        int t = sc.nextInt();
        double si = (p*r*t)/100.0;
        System.out.println(si);
    }
}
