import java.util.*;
public class TriangleCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b+c){
            
            System.out.println("Not a Triangle");
            if(b < a+c){
                
                if(c < a+b){
                    System.out.println("Triangle");
                }
            }
        }
        if(a>b+c){
                System.out.println("Not a Triangle");
            }
        if(b> a+c){
                    System.out.println("Not a Triangle");
                }
        if(c> a+b){
                    System.out.println("Not a Triangle");
                }
        else{
            System.out.println("Not a Triangle");
        }
    }
    
}