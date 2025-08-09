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
            }
        }
        if(tf){
            System.out.println("Invalid");
        } else if(n%2==0){
            for(int i=0, j=0;i<n;i+=2, j++){
                sum[j] = a[i]+a[i+1];
            }
            for(int i:sum){
                System.out.println(i +" ");
            }
        } else {
            System.out.println("Array length must be even.");
        }
}}