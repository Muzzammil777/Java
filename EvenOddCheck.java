import java.util.*;

public class EvenOddCheck{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ((a&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}