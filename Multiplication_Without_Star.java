import java.util.*;

public class Multiplication_Without_Star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int r=0;

        for(int i=1;i<=b;i++){
            r += a;
            System.out.print(r);
        }
    }
}
