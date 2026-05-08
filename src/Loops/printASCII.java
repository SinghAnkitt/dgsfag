package Loops;

public class printASCII {
    public static void main(String[] args) {
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch+ " = " + (ch+0));
        }
    }
}
