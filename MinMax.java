import java.util.Scanner;

/*
---------------------------------------------------------
Problem: Find Minimum and Maximum in an Array
---------------------------------------------------------
Description:
Read `n` integers into an array and find both the smallest (minimum)
and the largest (maximum) values in that array.

Sample Input:
6
10 5 30 25 7 40

Sample Output:
5
40

Time Complexity: O(n)
Space Complexity: O(1)

Approach:
- Initialize both `min` and `max` with the first element.
- Traverse the array from index 1 and update `min` and `max` accordingly.
*/

public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input: number of elements
        int n = s.nextInt();
        int[] array = new int[n];

        // Reading array elements
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        int min = array[0];
        int max = array[0];

        // Traverse to find min and max
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Output: minimum and maximum
        System.out.println(min);
        System.out.println(max);

        s.close();
    }
}
