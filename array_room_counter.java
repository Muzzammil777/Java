import java.util.*;

public class array_room_counter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int e[] =new int[n];

		int l[]=new int[n];

		int t=0,p=0;

		System.out.print("entry: ");

		for(int i=0; i<n; i++) {

			e[i]=sc.nextInt();

		}

		System.out.print("exit: ");

		for(int i=0; i<n; i++) {	

			l[i]=sc.nextInt();

		}

		for(int i=0;i<n;i++){

		    t=p+e[i];

		    p=t-l[i];

		}

		System.out.printf("Remaining: %d",p);

	}

}