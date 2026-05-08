package Arrays;
// Multiply odd indexed elements by 2 and add 10 to even indexed elements

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {23, 89, -34, 11, 32, 33, -42, 231, 11, -1, 10};
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] += 10;
            }else{
                arr[i] *= 2;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
