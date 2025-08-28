/*
 Problem: https://leetcode.com/problems/remove-element/
 Approach: Two-pointer technique (in-place modification)
 Date: 27-08-2025

 Explanation:
 - We use a pointer `c` to track the position of the next valid element (not equal to `val`).
 - Iterate through the array:
    → If the current element is NOT equal to `val`, place it at index `c` and increment `c`.
 - At the end, `c` represents the length of the new array without `val`.

 Time Complexity: O(n) → We traverse the array once.
 Space Complexity: O(1) → Done in-place without extra memory.
*/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c++] = nums[i];
            }
        }
        return c;
    }
}
