import java.util.*;

public class GradeCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        if(m>=91 && m<=100){
            System.out.println("O");
        }
        else if(m>=81 && m<=90){
            System.out.println("A+");
        }
        else if(m>=71 && m<=80){
            System.out.println("A");
        }
        else if(m>=61 && m<=70){
            System.out.println("B+");
        }
        else if(m>=51 && m<=60){
            System.out.println("B");
        }
        else if(m>=41 && m<=50){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}