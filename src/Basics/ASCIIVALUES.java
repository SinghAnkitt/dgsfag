package Basics;

public class ASCIIVALUES {
//    a = 97;       A = 65;       0 = 48;
//    b = 98;       B = 66;       1 = 49;
//    c = 99;       C = 67;       2 = 50;
//    :             :             :
//    :             :             :
//    z = 122;      Z = 90;       9 = 57;
//



    // Type Casting
    public static void main(String[] args) {
        char ch = 'y';
        int output = ch;
        System.out.println(output); // implicit typecasting

        char ankit = 'T';
        int see = (int)ankit;
        System.out.println(ankit+0);
        System.out.println(see); // explicit typecasting

        char harsh = '3';
        System.out.println((int)harsh);
        System.out.println(harsh + 0);
    }
}
