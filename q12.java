import java.util.*;

public class q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b){
            System.out.println(b + "is greater than" + a);
        }
        else if(a<=b){
            System.out.println(b + "is greater than or equal to" + a);}
        else if(a>=b){
            System.out.println(a + "is greater than or equal to" + b);
        }
        else{
            System.out.println(a + "is greater than" + b);
        }
        
    }
}