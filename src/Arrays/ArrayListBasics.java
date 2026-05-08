package Arrays;
import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(54);
        arr.add(4);
        arr.add(65);
        arr.add(11);
        arr.add(45);
        arr.add(18);

        System.out.println(arr.get(2));            // arr[2]
        arr.set(3, 7);                            // arr[3] = 7
        System.out.println(arr.get(3));

        System.out.println(arr);
        int n = arr.size();                       // arr.length
        for(int i = 0; i < n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // 54 4 65 7 45 18
        arr.add(44);
        System.out.println(arr);
        arr.add(1, 69);
        int m = arr.size();
        System.out.println(arr);
        arr.remove(m-1);
        System.out.println(arr);

        // Reverse the array
        int i= 0 , j = arr.size() - 1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);

        // Collections.reverse(arr);
        // System.out.println(arr);
    }
}
