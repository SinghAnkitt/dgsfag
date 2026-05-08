package Methods;

public class ReturnType {
    public static int name(int a){
        System.out.println("Ankit Singh");
        System.out.println("Trishna Sonowal");
        if (a > 0) return 6;
        else return 12;
    }
    public static void main(String[] args) {
        int res = name(6);
        System.out.println(res + 45);
    }
}
