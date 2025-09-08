class Solution {
    private boolean containsZero(int n){
        while(n>0){
            if(n%10==0) return true;
            n /= 10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for(int i=1;i<n;i++){
            if(!containsZero(i) && !containsZero(n-i)){
                arr[0] = i;
                arr[1] = n-i;
                break;
            }
        }
        return arr;
    }
}