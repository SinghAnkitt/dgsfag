package Recurssion;
import java.util.*;

public class p2again {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x > n) return;
        System.out.print(x +" ");
        print(x+1);
    }
}
