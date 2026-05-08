package basic_Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {23, 5, 54, 21, -3, -111, 56, -5, 98, 1};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < n; j++){
                if(arr[j]<min){
                    min = arr[j];
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
