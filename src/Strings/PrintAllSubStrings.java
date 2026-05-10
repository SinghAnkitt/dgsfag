package Strings;
import java.util.*;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
