/*
 * Problem statement
Sam is making a Triangular painting for a maths project.
An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.
Example:
Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 25
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
1
1 2 
1 2 3
Sample Input 2 :
1
Sample Output 2 :
1
 */

#include <iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter the value of N: ";
    cin >> n;

    cout << "Output: " << endl;
    for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout << j << " ";
        }
        cout << endl;
    }
    
    return 0;
}
