package Functions;
import java.util.*;

public class varArgs {
    public static void main(String[] args) {
        fun(43,453,534,2,32,322,1,45,2);
        multiple(122,23,"Ankit", "Kirmada", "Aaltu", "Faltu");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
