import java.util.*;

public class RowNumberPattern{
    public static void main(String args[]){
        int n = 6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}