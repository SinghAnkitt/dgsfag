package basic_Sorting;

public class selectionSort1 {
    public static void main(String[] args) {
        int[] arr = {23, 5, 54, 21, -3, -111, 56, -5, 98, 1};
        int n = arr.length;
        for(int i = n-1; i > 0; i--){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j = i; j >= 0; j--){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
