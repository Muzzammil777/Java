import java.util.*;

public class array_sequence_checker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int c=0;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==0)
                {
                    if(a[j]==1){
                    c++;
                }
            }
            }
        }    
        System.out.println(c);
        
    }
}
