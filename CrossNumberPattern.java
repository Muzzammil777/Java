/*import java.util.*;

public class q57{
    public static void main(String args[]){
        int n = 5;
        int a = 1;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if()
                    System.out.print(a);
                    else
                    System.out.print("  ");
            }
            a++;
            System.out.println();
        }     
            
        }
    }
 */

import java.util.*;
import java.io.*;

public class CrossNumberPattern {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		if(n%2 !=0) {

			for(int i=1; i<=n; i++) {

				for(int j=1; j<=n; j++) {

				    if((i==j) || (i+j == n+1)){

				        System.out.printf(" %d",i);

				    }else{

				        System.out.print("  ");

				    }

				}

				System.out.print("\n");

			}

		}else{

		    System.out.println("Enter positive number..");

		}

	}

}