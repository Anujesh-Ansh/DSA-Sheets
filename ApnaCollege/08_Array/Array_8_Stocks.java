import java.util.*;

public class Array_8_Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of days: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the price of stocks: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        int profit = 0;
        int min = a[0];
        int max = Integer.MIN_VALUE;
        int po=0;

        for(int i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
                po=i;
            }
            if(po == n-1){
                profit=0;
            }
            else{
                for(int j=po+1;j<n;j++){
                    if(a[j]>max){
                        max = a[j];
                    }
                }
                profit = max-min;
            }
        }
        System.out.println("Maximum profit is: "+profit);
        sc.close();
    }
}
