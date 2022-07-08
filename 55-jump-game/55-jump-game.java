class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null) return false;
        int end = nums.length - 1 ;
        for(int i =nums.length - 2 ; i >=0 ; i--){
            if(i+nums[i] >= end)end = i ;
        }
        return end == 0;
    }
}