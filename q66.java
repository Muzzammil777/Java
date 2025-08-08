import java.util.*;

public class q66 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d = 0;
        int temp = n;

        while(temp > 0){
            temp = temp/10;
            d++;
        }
        if(d == 1){
            System.out.println(n);
            return;
        }
        int l = n%10;
        int pow = 1;

        for(int i=1;i<d;i++){
            pow*=10;
        }
        int f = n/pow;
        n = n%pow;
        n=n/10;
        int r = l*pow+n*10+f;
        System.out.println(r);
    }
}