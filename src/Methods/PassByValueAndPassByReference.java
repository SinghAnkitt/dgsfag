package Methods;

public class PassByValueAndPassByReference {
    public static void change(int x){
        x = 19;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(6);
        System.out.println(x);
    }
}
