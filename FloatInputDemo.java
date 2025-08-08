import java.util.*;

public class FloatInputDemo{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Float value");
        float num = sc.nextFloat();

        System.out.printf("%.2f", num);
        sc.close();
    }
}