class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        long g = x;  // start guess as x (use long to avoid overflow)
        while (g * g > x) {
            g = (g + x / g) / 2; // Newton's iteration
        }
        return (int) g;
    }
}