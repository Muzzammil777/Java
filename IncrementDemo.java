import java.util.*;

public class IncrementDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int i;
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(i=1;i<=b;i++){
            a++;  
        }
        System.out.println(a);
    }
}