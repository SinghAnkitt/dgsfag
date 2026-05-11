package Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String s = "Ankit";
        StringBuilder sb = new StringBuilder(s);
        sb.append("Singh");
        System.out.println(sb);
       // sb.reverse();
        // System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,'n');
        System.out.println(sb);
        sb.delete(0,5);// 0 to 4
        System.out.println(sb);
    }
}
