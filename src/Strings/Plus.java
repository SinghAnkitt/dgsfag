package Strings;

public class Plus {
    public static void main(String[] args) {
        String s = "Bhakti";
        s += " hi shakti hai";
        System.out.println(s);
        s += 10;
        System.out.println(s);
        s += '\n'; // takes to next line
        s += "next line me aa gye";
        System.out.println(s);
        String s1 = "Ankit";
        System.out.println(s1+10+20);
        System.out.println(10+20+s1);
        System.out.println(10+s1+20);
    }
}
