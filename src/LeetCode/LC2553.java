package LeetCode;
import java.util.*;

public class LC2553 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            String s = String.valueOf(num);
            for(int i = 0; i < s.length(); i++){
                list.add(s.charAt(i)-'0');
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for(int ele : answer){
            System.out.print(ele+"  ");
        }
    }
}
