import java.util.*;

public class Array_5_Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of packets: ");
        int n = sc.nextInt();
        int []a = new int[n];

        System.out.println("Enter the size of the packets: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the no. of students: ");
        int m = sc.nextInt();

        Arrays.sort(a);

        int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            int x = i+m-1;
            if(x<n){
                int diff = a[x]-a[i];
                if(diff<min){
                    min = diff;
                }
            }
            
        }
        System.out.println("Minimum difference is: "+min);

        sc.close();
    }
}
