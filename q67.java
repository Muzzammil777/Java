import java.io.*;

import java.util.*;

public class q67{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a=n;

        int c=0;

        while(a>0){

        int b=a%10;

        c=c+b;

        a/=10;

    }

    if(n%c ==0){

        System.out.print("harshad____");

    }else{

        System.out.print("not Harshad___");               

    }
    }

}


