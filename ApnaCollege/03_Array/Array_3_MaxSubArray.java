import java.util.*;

// Kadane's Algorithm
public class Array_3_MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0;i<n;i++){
            currentSum = currentSum + a[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.println("\nMaximum sum of SubArray is: "+maxSum);

        sc.close();
    }
}
