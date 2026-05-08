package Strings;
import java.util.*;
public class NumberofVowels {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String word = "ankit singh";
        int n = word.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch== '0'|| ch == 'u'){
                count++;
            }
        }
        System.out.println("Total number of Vowels : " + count);
    }
}
