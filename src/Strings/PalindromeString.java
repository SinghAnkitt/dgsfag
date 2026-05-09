package Strings;
import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String input = sc.next();
        int length = input.length()-1;
        int i = 0;
        boolean ans = true;
        while(i < length){
            if(input.charAt(i) != input.charAt(length)) {
                ans = false;
                break;
            }
            i++;
            length--;
        }
        if(ans == true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
