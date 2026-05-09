package Strings;

public class PassingStringtoMethod {
    public static void change(String x){
        x = "Singh";
    }

    public static void main(String[] args) {
        String x = "Ankit";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
