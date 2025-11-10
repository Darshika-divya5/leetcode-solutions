class Solution {
    public int differenceOfSum(int[] nums) {
    int sum = 0;   int digitSums = 0;
        for(int n:nums) {
            sum = sum+n;
            while(n>0){
                digitSums = digitSums + n%10;
                n/=10;
            }
        }
       return sum-digitSums>0 ? sum-digitSums : digitSums- sum; 
    }
}
