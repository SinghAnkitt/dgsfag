package OOPS;
import java.util.*;

class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class BASICS {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Red";
        pen1.type = "Gel";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "BallPoint";

        pen1.printColor();
        pen2.printColor();
    }
}
