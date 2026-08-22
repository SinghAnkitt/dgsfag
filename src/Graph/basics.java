package Graph;
import java.util.*;

public class basics {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        int vertices = 5;
        for(int i = 0; i < vertices; i++){
            graph.add(new ArrayList<>());
        }
        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,3);
        addEdge(2,4);
        addEdge(3,4);
    }
    static void addEdge(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void printGraph(){
        for(int i = 0; i < graph.size(); i++){
            System.out.println(i + " -> ");
            for(int neighor : graph.get(i)){
                System.out.print(neighor + " ");
            }
        }
    }
}
