import java.util.*;

public class q52{
    public static void main(String args[]){
        int n = 5;
        int c = 1;
        int a = 2;

        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                     System.out.print((c) + " ");
                     c+=2;
                }
               else{
                 System.out.print((a) + " ");
                 a+=2;
               }
            }
            System.out.println();
        }
    }
}