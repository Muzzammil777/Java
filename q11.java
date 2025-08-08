import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 5; //sc.nextInt();

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println(a);

        System.out.println(981<<2);
        int b = a++ + ++a + a-- + --a;
    }   
}
