package Functions;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)) System.out.println(i + " ");
        }
    }
    static boolean isArmstrong(int n){
        int num = n;
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum += (temp*temp*temp);
            n /= 10;
        }
        if(sum == num) return true;
        else return false;
    }
}
