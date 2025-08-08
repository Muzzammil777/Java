import java.util.*;
public class SwapVariables {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c;
        
        c = a;
        a = b;
        b = c;
        
        System.out.println(a + " " + b);
        }
} 