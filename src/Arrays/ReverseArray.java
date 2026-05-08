package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {34, 23, 98, 78, 45, 23, 22, 11};
        int i = 0;
        int j = arr.length-1;
        while(j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
