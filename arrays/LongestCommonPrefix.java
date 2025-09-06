/*gt
 Problem: https://leetcode.com/problems/longest-common-prefix/
 Approach: one-pointer approach.
 Time: O(N * M) (N = number of strings, M = length of shortest string)
 Space: O(1)
 Date: 28-08-2025
*/


class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // case 1
        if(strs.length==0)
            return "";

        // case 2 check 0 index with other index characters and measure length
        // ex:- strs = ["flower","flow","flight"] max length here is 4 i.e i=strs[j].length
        
        for(int i=0; i<strs[0].length();i++)
            for(int j=1; j<strs.length; j++)
                if(i==strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0,i);
        
        // case 3 if all are same strings
        return strs[0];
        
    }
}