package Recurssion;
import java.util.*;
// Print integers from n to 1
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        print(m);
    }

    public static void print(int n){
        if(n == 0) return;
        System.out.println(n);
        print(n-1);
    }
}
