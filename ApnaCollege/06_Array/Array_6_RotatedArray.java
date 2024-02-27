import java.util.*;

public class Array_6_RotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the key to be searched: ");
        int k = sc.nextInt();

        int low =0;
        int high = n-1;
        int pivot=-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(a[mid]>a[mid+1]){
                pivot = mid;
                break;
            }
            else if(a[mid]<a[mid-1]){
                pivot = mid-1;
                break;
            }
            else if(a[low]>a[mid]){
                high = mid-1;
            }
            else if(a[low]<a[mid]){
                low = mid+1;
            }
        }

        if(k == a[pivot]){
            System.out.println("Element found at index: "+pivot);
        }
        else if(k>=a[0]){
            low = 0;
            high = pivot;
            while(low<=high){
                int mid = (low+high)/2;
                if(a[mid] == k){
                    System.out.println("Element found at index: "+mid);
                    break;
                }
                if(a[mid]>k){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        else{
            low = pivot+1;
            high = n-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(a[mid] == k){
                    System.out.println("Element found at index: "+mid);
                    break;
                }
                if(a[mid]>k){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        sc.close();
    }
    
}


// if(a[mid] == k){
    //     System.out.println("Element found at index: "+mid);
    //     break;
    // }
    // if(a[mid]>k){
    //     low = mid+1;
    // }else{
    //     high = mid;
    // }
    // }