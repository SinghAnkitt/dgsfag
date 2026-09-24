package Functions;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
        String name = "This will not change";
        changeName(name);
        System.out.println(name);

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void changeName(String name){
        name = "Ankit Singh";
    }
}
