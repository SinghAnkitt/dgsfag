package Recurssion;

public class FunctionCallingItself {
    public static void main(String[] args) {
    ankit(1);
    }
    public static void ankit(int n){
        if(n == 10) return;
        System.out.println("Isha");
        ankit(n + 1);
    }
}
