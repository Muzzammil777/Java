import java.util.*;

public class ReverseNumberPrint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i=a;

        while(i>=1){
            System.out.print(i + " ");
            i--;
        }
        
    }
}