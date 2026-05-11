package Strings;
import java.util.*;

public class SumOfSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String s = sc.next();
        int n = s.length();
        long sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                long k = Long.parseLong(s.substring(i,j));
                sum += k;
            }
        }
        System.out.println(sum);
    }
}

