import java.util.*;

public class twosum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int a[] = {2,7,11,5};
        int inp = sc.nextInt();

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(inp==(a[i]+a[j])){
                    System.out.print(i+ ","+j);
                }
            }
        }
    }
}
