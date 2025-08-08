import java.util.*;

public class q14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if((num%3==0)&& if(num%5==0)){
            
            System.out.println("The number " + num + " is divisible by 3 and 5");
            }
        else{
            System.out.println("The number " + num + " is not divisible by 3 and 5");
            }
    }
}