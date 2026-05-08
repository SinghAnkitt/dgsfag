package PatternPrinting;
import java.util.*;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m + 96;
        for(int i = 97; i <= n; i++){
            for(int j = 97; j <= n; j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}
