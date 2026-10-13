package Recurssion;

public class GlobalVariables {
    static int x = 10;
    public static void main(String[] args) {
        fun();
        System.out.println(x);
        x = 20;
        System.out.println(x);
        int x = 12;
        System.out.println(x);
        x = 56;
        System.out.println(x);
    }
    public static void fun(){
        x = 37;
        System.out.println(x);
    }
}
