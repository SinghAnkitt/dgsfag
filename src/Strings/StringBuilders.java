package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.capacity());
        StringBuilder s = new StringBuilder("Ankit");
        System.out.println(s.length()+" "+s.capacity());
        s.append(" Singh");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.setCharAt(3, 'a');
        System.out.println(s);
    }
}
