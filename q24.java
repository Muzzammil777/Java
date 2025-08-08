import java.util.*;

public class q24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        if(a>='A' && a<='Z'){
            char b = (char)(a+32);
            System.out.println(b);
        }
        else{char b = (char)(a-32);
        System.out.println(b);}

    }
}