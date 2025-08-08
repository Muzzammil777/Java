import java.util.*;
import java.io.*;

public class ReverseNumber {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		int a=n;

		int b=1,c=0;

		while(a>0) {

			b = a%10;

			c=c*10 + b;

			a=a/10;

        }

	}

}