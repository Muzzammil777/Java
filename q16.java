import java.util.*;

public class q16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a>=b){
            System.out.println("The number " + a + " is greater than or equal to " + b);
        } else {
            System.out.println("The number " + a + " is less than " + b);
        }
    }
}