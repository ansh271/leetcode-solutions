class Solution {
  public boolean isPowerOfTwo(int n) {
    return n >= 0 && Integer.bitCount(n) == 1; // return the total  umber of 1's in n's binary
  }
}