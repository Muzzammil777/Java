import java.util.*;

public class DigitCounter{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c=0;

        while(a>0){
            c++;
            a=a/10;
        }
        System.out.println(c);



    }
}