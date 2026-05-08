package Methods;

public class Arguments {
    public static void max(int a, int b, int c) {// parameters
        System.out.println(Math.max(a, Math.max(b, c)));
    }
    public static void main(String[] args) {
        max(34, 9, 99); // arguments
    }
}
