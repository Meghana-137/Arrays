import java.util.Arrays;

/*
---------------------------------------------------------
Problem: Mark Elements That Are Power of Two
---------------------------------------------------------
Description:
Given an array of integers, update each element:
- Set to 1 if it is a power of 2
- Set to 0 if it is not a power of 2

A number is a power of 2 if it has only one bit set in its binary representation.
This can be checked using the condition: (n & (n - 1)) == 0 and n != 0

Sample Input:
[1, 2, 4, 6, 57, 76, 97, 8, 64, 32]

Sample Output:
[1, 1, 1, 0, 0, 0, 0, 1, 1, 1]

Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)
*/

public class PowerOfTwoMarker {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 57, 76, 97, 8, 64, 32};

        // Traverse each element and check power of 2
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & (arr[i] - 1)) == 0 && arr[i] != 0) {
                arr[i] = 1;  // It's a power of 2
            } else {
                arr[i] = 0;  // Not a power of 2
            }
        }

        // Output the updated array
        System.out.println(Arrays.toString(arr));
    }
}
