class Solution {
    public int removeDuplicates(int[] nums) {
        int max = nums[0]; int min = nums[0];
        for(int x: nums){
            if(x>max){
                max=x;
            }else if(x<min){
                min = x;
            }
        }
        
        int[] freq =new int[max-min+1];
        for(int n : nums ){
            freq[n-min]++;
        }
        
         int index = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 1) {
                nums[index] = i + min; // nums me overwrite
                index++;
            }
        }

        return index;
    }
}
