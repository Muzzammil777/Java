import java.util.*;

public class BorderNumberPattern{
    public static void main(String args[]){
        int n = 5;
        int a = 1;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n || j==1 || j==n)
                    System.out.print(a + " ");
                    else
                    System.out.print("  ");
            }
            a++;
            System.out.println();
        }            
        }
    }
