import java.util.*;
import java.io.*;

public class DigitProduct {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		int a=n;

		int b=1;

		while(a>0) {

			b *= a%10;

			a=a/10;

		}

		System.out.println(b);

	}

}