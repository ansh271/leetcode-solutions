/*  
 Problem: https://leetcode.com/problems/search-insert-position/
 Approach: Linear Search (O(n))
 - If target is greater than the last element, return length of array.
 - Otherwise, iterate through array:
   - If target matches current element OR is smaller, return index.
 - If no match found during loop, return i (end position).
 Date: 27-08-2025
*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (i = 0; i < nums.length; i++) {
            if (target == nums[i] || target < nums[i]) {
                return i;
            }
        }
        return i;
    }
}
