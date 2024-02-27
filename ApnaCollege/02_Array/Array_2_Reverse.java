import java.util.*;

public class Array_2_Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
    
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println("Reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        a = null;
    
        sc.close();
    }
}



