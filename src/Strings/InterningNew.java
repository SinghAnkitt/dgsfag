package Strings;

public class InterningNew {
    public static boolean equals(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "Amit";
        String s2 = "Amit";
        System.out.println(s1 == s2);
        String a = new String("Ankit");
        String b = new String("Ankit");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
