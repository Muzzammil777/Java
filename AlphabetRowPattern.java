import java.util.*;

public class AlphabetRowPattern{
    public static void main(String args[]){
        int n = 5;
        char c = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
        }
    }
}