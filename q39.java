import java.util.*; 

public class q39{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int num=0;

        for(i=1;i<=n;i++){
            if(n%i==0){
                num++;
                break;
            }
        }
        if(num==2){
                    System.out.println("Prime Number");
                }
        else{
                    System.out.println("Not a Prime Number");
                }
    
    }
}