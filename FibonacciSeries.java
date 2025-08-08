import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        
        System.out.println();
        sc.close();
    }
}