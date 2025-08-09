import java.util.*;
public class PowerCalculation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int power = 1;
        for (int i = 0; i < p; i++) {
            power *= n;
        }
        System.out.println(power);
    }
}