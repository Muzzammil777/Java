import java.util.*;
public class q19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a");
            }
            else{
                System.out.println("c");
            }
        }
        if(a<=b){
        if(b>c){
            System.out.println("b");
        }
        else{
            System.out.println("c");
        }
      }
    }
}