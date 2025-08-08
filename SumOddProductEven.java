import java.util.*;

public class SumOddProductEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int sum=0;
        int prod=1;
        

        for (i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
            else{
                prod*=i;
            }
        }
        System.out.println("The sum odds is "+sum);
        System.out.println("The product of evens is "+prod);
    }
}