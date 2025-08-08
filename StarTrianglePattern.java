import java.util.*;

public class StarTrianglePattern{
    public static void main(String args[]){
        int n = 5;
        char c = '*';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}