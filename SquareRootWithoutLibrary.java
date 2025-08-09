import java.util.*;

public class SquareRootWithoutLibrary {
    // Computes floor integer square root using binary search
    static long isqrt(long n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n < 2) return n;
        long lo = 1, hi = n / 2, ans = 1;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long sq = mid * mid;
            if (sq == n) return mid;
            if (sq < n) { ans = mid; lo = mid + 1; } else { hi = mid - 1; }
        }
        return ans;
    }

    // Approximates square root (double) using Newton-Raphson
    static double dsqrt(double n, double eps) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n == 0) return 0;
        double x = n; // initial guess
        while (true) {
            double nx = 0.5 * (x + n / x);
            if (Math.abs(nx - x) <= eps) return nx;
            x = nx;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read a number; works for both integer & fractional
        double input = sc.nextDouble();

        long floorInt = isqrt((long) input);
        double precise = dsqrt(input, 1e-9);

        System.out.println("Integer floor sqrt: " + floorInt);
        System.out.println("Approx sqrt: " + precise);
    }
}
