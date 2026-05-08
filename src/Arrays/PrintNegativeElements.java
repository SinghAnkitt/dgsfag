package Arrays;

public class PrintNegativeElements {
    // Given an array print the negative elements only
    public static void main(String[] args) {
        int[] arr = {34, -2, 99, -43, -87, -22, 90, 79, 66, -77, -1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
