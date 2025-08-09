import java.util.*;

public class array_duplicates
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c=0;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                {
                 b[i] = a[i];         
                }
            }
        }
        for(int i : b){
            if(i!=0)
             System.out.print(i+ " ");
        }
        
    }
}
