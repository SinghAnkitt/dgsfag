package Functions;
import java.util.*;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(x); // 90
        int x = 40;
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
