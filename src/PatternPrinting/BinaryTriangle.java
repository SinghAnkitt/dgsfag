package PatternPrinting;
import java.util.*;

//public class BinaryTriangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                if(i % 2 != 0){
//                    if(j % 2 != 0){
//                        a = 1;
//                        System.out.print(a+" ");
//                    }else{
//                        a = 0;
//                        System.out.print(a+" ");
//                    }
//                } else{
//                    if( j % 2 != 0){
//                        a = 0;
//                        System.out.print(a+" ");
//                    }else{
//                        a = 1;
//                        System.out.print(a+" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class BinaryTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}