package Strings;

public class CompareToStringMethod {
    public static void main(String[] args) {
        String s1 = "Harsh";
        String s2 = "Harshitam";
        String s3 = "Harmeet";
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s1.compareTo(s2));
        s1.concat(s2); // Wont work
        System.out.println(s1);
        System.out.println(s1.concat(s2));
    }
}
