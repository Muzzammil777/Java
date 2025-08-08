import java.util.*;

public class q22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double u = sc.nextDouble();

        if(u>=0 && u<=50){
            System.out.println("Bill: " + ((u*=0.5)+(u*0.2)));
        }
        else if(u>=51 && u<=150){
            System.out.println("Bill: " + (25+(u*=0.75)+(u*0.2)));
        }
        else if(u>=151 && u<=250){
            System.out.println("Bill: " + (100+(u*=1.2)+(u*0.2)));
        }
        
    }
}