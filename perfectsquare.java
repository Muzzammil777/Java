import java.util.*;

public class perfectsquare {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        perfectsquare ps = new perfectsquare();
        ps.checkPerfectSquare();
    }

    public void checkPerfectSquare() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        if (sqrt * sqrt == num) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }

}
