import java.util.*;

public class array_added_odd_printing {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int sum[] = new int[n/2];
        boolean tf = false;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                tf = true;
            }}
            if(n%2==0){
            for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                sum[i] = a[i]+a[j];
            }}
        }
 
        if(tf){
            System.out.println("Invalid");
        }
        for(int i=0;i<n/2;i++){
        System.out.print(sum[i]);
}
}}