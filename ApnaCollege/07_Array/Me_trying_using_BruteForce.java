import java.util.*;

public class Me_trying_using_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();  // length of array
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int flag = 0;

        // finding if the array is sorted in descending order or not
        for(int x =0;x<n-1;x++){
            if(a[x]>a[x+1]){
                flag=flag+1;
            }

        }


        System.out.println('\n');

        if(flag == n-1){ // if it is sorted in descending order, then it means, ki saare combinations ho chuke hai, aur ab seedha 1st state mei jaana hoga
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        else{
            int p =-1;

            for(int i =n-1;i>0;i--){
    
                if(a[i]>a[i-1]){
                    p=i-1;
                    break;
                }
            }
    
            int max = a[p];
            int smax = a[p];
            int min = a[p];
            for(int j = p+1;j<n;j++){
                if(a[j]>max && a[j]>smax){
                    max = smax =a[j];
                }
                else if(a[j]>smax && a[j]<max){
                    smax = a[j];
                }
                if(a[j]<min){
                    min = a[j];
                }
            }

    
            if(max == a[p+1]){
                int temp = a[p];
                a[p]=a[p+1];
                a[p+1]=temp;
    
                for(int k = p+1;p<n-2;p++){
                    if(a[k]>a[k+1]){
                        int temp1 = a[k];
                        a[k] = a[k+1];
                        a[k+1] = temp1;
                    }
                }
            }

            for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
    
        }


        sc.close();
    }
}
