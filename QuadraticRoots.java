// -b +- ROOT(b^2 - 4ac)
//------------------------
//          2(a)


import java.util.*;

public class QuadraticRoots{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if((Math.pow(b,2)-(4*a*c)>0))
        {
            double r1 = ((-b) + Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
            double r2 = ((-b) - Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);

            System.out.println("r1: "+r1);
            System.out.println("r2: "+r2);
        }
        else if((Math.pow(b,2)-(4*a*c)<0))
        {
             double r3 = (-b) / (2*a);
             double r4 = (-(Math.pow(b,2)-(4*a*c))) / (2*a);
             System.out.println("r3 + r4i: "+r3+" + "+r4+"i");
             System.out.println("r3 - r4i: "+r3+" - "+r4+"i");

        }
        else if((Math.pow(b,2)-(4*a*c)==0))
        {
            double r5 = (-b) / (2*a);
            System.out.println("r5: "+r5);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}