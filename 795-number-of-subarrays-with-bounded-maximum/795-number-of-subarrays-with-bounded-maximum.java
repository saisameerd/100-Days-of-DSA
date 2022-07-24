class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start = -1;
        int end = -1;
        int res = 0 ;
        for(int i =0 ;i<nums.length ; i++){
            if(nums[i]>=left && nums[i] <= right){
                end = i;
            }else if(nums[i]>right){
                start = end = i ; 
            }
            
            res+=(end-start);
            
        }
        
        return res;
    }
}