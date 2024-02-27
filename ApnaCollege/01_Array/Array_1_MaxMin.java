// Given an array of size N. The task is to find the maximum and the minimum element 
// of the array using the minimum number of comparisons.

// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//         Maximum element is: 9

import java.util.*;

public class Array_1_MaxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max,min;
        max = min = a[0];
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        a = null;
        
        System.out.println("Maximum element is: "+max);
        System.out.println("Minimum element is: "+min);

        sc.close();
    }
}


