import java.util.*;
public class array_element_finder {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number elements: ");
    int n = sc.nextInt();
    
    int a[] = new int[n];
    boolean found = false;
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    System.out.println("Enter the number to search: ");
    int e = sc.nextInt();
    for(int i=0;i<n;i++){
        if(a[i]==e){
            found = true;
        }
    }
    if(found)
    System.out.println("element found");
    else
    System.out.println("element not found");
}
}

