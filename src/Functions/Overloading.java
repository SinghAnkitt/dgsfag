package Functions;
import java.util.*;
// 2 or more function have the same name , same return type but different arguments is known as overloading
public class Overloading {
    public static void main(String[] args) {
        fun(34);
        fun("Ankit");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
