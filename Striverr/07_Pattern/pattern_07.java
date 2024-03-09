/*
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.
Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 20
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
Explanation Of Sample Input 1 :
The first row contains two spaces, followed by a star.
The second row contains one space, followed by three stars.
The third row contains five stars.
Sample Input 2 :
1
Sample Output 2 :
*

*/
import java.util.*;

public class pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
