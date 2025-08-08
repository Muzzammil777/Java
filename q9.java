import java.util.*;
public class q9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        a+= b;
        b= a-b;
        a-= b;

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println(a + " " + b);
        }
} 