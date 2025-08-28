/*
 Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 Approach: Use LinkedHashSet to maintain order while removing duplicates (O(n) time, O(n) space)
 Date: 26-08-2025
*/



import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // making a set which removes the duplicates
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(int n : nums){
            uniqueSet.add(n);
        }
        
        // updating the nums
        int i = 0;
        for (int num : uniqueSet) {
            nums[i++] = num;
        }

        return uniqueSet.size();
    }
}
