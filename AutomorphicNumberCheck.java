import java.util.Scanner;

public class AutomorphicNumberCheck
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sq = n * n;

        int temp = n;

        boolean a = true;

        while (temp > 0) {

            if ((temp%10) != (sq%10)) {

                a = false;

                break;

            }

            temp /= 10;

            sq /= 10;

        }

        if (a)

            System.out.println("Automorphic Number");

        else

            System.out.println("Not an Automorphic Number");

    }

}


