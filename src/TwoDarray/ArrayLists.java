package TwoDarray;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(4); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(12); b.add(423); b.add(31);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1233); c.add(413); c.add(33); c.add(47);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(11); d.add(422);

        arr.add(a); arr.add(b); arr.add(c); arr.add(d);
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

//        for(ArrayList<Integer> list : arr){
//            for(int ele : list){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
    }
}
