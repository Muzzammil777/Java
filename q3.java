import java.io.*;
import java.util.*;

public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a text");
        String text = sc.nextLine();
        System.out.println("Enter a double");
        double d = sc.nextDouble();
        System.out.println("Enter a character");
        char character1 = sc.next().charAt(0);
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
        System.out.println("Character: " + character1);
        System.out.println("Double: " + d);
        sc.close();
    }
}