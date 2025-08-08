import java.util.*;

public class GreatestOfThreeTernary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        
        String r = ((a>b)&&(a>c)?"a is greater":"a is smaller than b and c");
        System.out.println(r);
        r = ((b>a)&&(b>c)?"b is greater":"b is smaller than a and c");
        System.out.println(r);
        r = ((c>a)&&(c>b)?"c is greater":"c is smaller than a and b");
        System.out.println(r);
    }
}