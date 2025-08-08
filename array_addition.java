import java.util.*;
public class array_addition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

       for(int i=0;i<n;i++){
           if(a[i]%2==0){
            e+=a[i];
           }
           else{
            o+=a[i];
           }
       }
       
        System.out.print(e+" "+o);
       

    }
}