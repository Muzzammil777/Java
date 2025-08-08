import java.util.*;
public class array_input {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int size = sc.nextInt();
    int a[] = new int[size];
    
    for(int i=0;i<size;i++){
        a[i] = sc.nextInt();
    }
    for(int i=0;i<size;i++){
        sum+=a[i];
    }
    System.out.println(sum);
}
}


