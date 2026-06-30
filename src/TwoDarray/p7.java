package TwoDarray;
// Snake print column wise

public class p7 {
    public static void main(String[] args) {
        int[][] arr = {
                {2,8,3,4,7},
                {7,2,1,6,3},
                {5,5,4,1,4},
                {3,1,8,2,6}
        };
        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
                else{
                    for(int k = arr.length-1; k >= 0; k--){
                        System.out.print(arr[k][j]+" ");
                    }
            }

            System.out.println();
        }
    }
}
