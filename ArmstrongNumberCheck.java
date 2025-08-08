import java.util.*;

public class ArmstrongNumberCheck

{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int s=0;

		int a=n;

		int c=0;

		while(a>0) {

		    c++;

		    a/=10;

		}

		int temp=n;

		while(n!=0) {

		    int b=n%10;

		    int p=1;

		    for(int i=1;i<=c;i++) {

		        p*=b;

		    }

		    s=s+p;

		    n/=10;

		}

		if(s==temp) {

		    System.out.print("Armstrong");

		}

		else {

		    System.out.print("Not Armstrong");

		}

	}

}