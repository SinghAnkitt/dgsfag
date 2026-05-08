package Loops;
import java.util.*;

public class printTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int mult = n * i;
            System.out.println(n+" * "+i+" = "+ mult);
        }
    }
}
