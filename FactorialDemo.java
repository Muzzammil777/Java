import java.util.*;

public class FactorialDemo{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        int i;
        long fact = 1;

        for (i=1;i<=num;i++){
            fact = i*fact;
        }
        System.out.println("The factorial of" + " is " + fact);
    }
}