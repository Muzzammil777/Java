import java.util.*;

public class q48{
    public static void main(String args[]){
        int n = 5;
        char c = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<c-39;j++){
                System.out.print((char)(c+j)+" ");
            }
            System.out.println();
        }
    }
}