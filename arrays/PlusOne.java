/*gt
 Problem: https://leetcode.com/problems/plus-one/description/
 Approach: Iterative carry propagation from right to left (O(n))
 Date: 27-08-2025
*/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // Traverse from the last digit to the first
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                // Case 1: Current digit is less than 9
                // Just increment and return since no carry needed
                ++digits[i];
                return digits;
            } else {
                // Case 2: Current digit is 9
                // Set current to 0 and continue to propagate carry left
                digits[i] = 0;
            }
        }

        // Case 3: If all digits were 9 (e.g., 999 → 1000)
        // Create a new array with an extra digit
        int[] ans = new int[digits.length + 1];
        ans[0] = 1; // First digit set to 1, others default to 0
        return ans;
    }
}
