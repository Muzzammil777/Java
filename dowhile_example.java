import java.util.*;

public class dowhile_example {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
 

        int c = 0;
        do{
            a/=10;
            c++;
        }
    while(a>0);
    System.out.println(c);
}
}
