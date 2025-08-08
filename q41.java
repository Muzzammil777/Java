import java.util.*;

public class q41{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i,j;
        for(i=a;i<=b;i++){
            int c=0;
            {
            for(j=2;j<i;j++){
                if(i%j==0){
                    c++;
                    break;
                }}
                if(c==0){
                System.out.println(i + " ");
             }
        }
    }
}
}