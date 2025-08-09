import java.util.*;

public class array_sum_of_large_and_small {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int l = 0;
    int s = 0;

    System.out.println("Enter the number of elements: ");
    int n = sc.nextInt();
    
    int a[] = new int[n];
    boolean found = false;
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
            if(i>j){
                l=a[i];
            }  
        }
    }
    for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
            if(i<j){
                s=a[i];
            }  
        }
    }
    
    System.out.println(l+s);
}
}