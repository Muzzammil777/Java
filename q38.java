import java.util.*; 

public class q38{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int num=0;

        for(i=1;i<=n/2;i++){
            if(n%i==0){
                num+=i;
            }
        }
        if(num==n){
                    System.out.println("Perfect Number");
                }
        else if(num!=n){
                    System.out.println("Not a Perfect Number");
                }
    
    }
}