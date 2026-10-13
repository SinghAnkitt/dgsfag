package OOPS;
import java.util.*;

class Students{
    int rno;
    String name;
    float marks;
}

public class Student {
    public static void main(String[] args) {
        Students ankit = new Students();
        ankit.rno = 23;
        ankit.marks = 84;
        ankit.name = "AaltuFaltu";
        System.out.println(ankit.rno);
        System.out.println(ankit.marks);
        System.out.println(ankit.name);
    }
}
