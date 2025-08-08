import java.util.*;

public class q26{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(y%4==0 || y%100==0 || y%400==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}