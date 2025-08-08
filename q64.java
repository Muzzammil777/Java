import java.util.*;

public class q64

{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int s=0;

		int a=n;

		int c=0;

		

		int temp=n;

		while(n!=0) {

		    int b=n%10;
            int fact;
		    int p=0;

		    for(int i=1;i<=c;i++) {

		        fact*=i;

		    }
            p+=fact;
		}

		if(n==fact) {

		    System.out.print("Armstrong");

		}

		else {

		    System.out.print("Not Armstrong");

		}

	}

}