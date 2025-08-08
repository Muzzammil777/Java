import java.util.*;

public class q18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c>='a'&&c<='z'){
            System.out.println("Lower Case");
        }
        else if(c>='A'&&c<='Z'){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}