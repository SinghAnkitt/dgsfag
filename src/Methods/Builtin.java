package Methods;
import java.util.*;

public class Builtin {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(25));
//        System.out.println(Math.cbrt(125));
//        System.out.println(Math.abs(-25));
//        System.out.println(Math.abs(25));
//        System.out.println(Math.floor(7.5));
//        System.out.println(Math.floor(-7.5));
//        System.out.println(Math.ceil(3.0001));
//        System.out.println(Math.ceil(-9.5));
//        System.out.println(Math.min(324.54, 3431));
//        System.out.println(Math.max(76, 91));
//        System.out.println(Math.pow(2, 4));
//        Take three four as input and print the greatest of them

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integers : ");
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println(Math.max(Math.max(a, d), Math.max(b, c)));
    }
}
