class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length- 1;
        int[] ans = new int[nums.length];
        int j = nums.length- 1;
        while(l<=r){
            if((nums[l]*nums[l]) < (nums[r]*nums[r])){
                ans[j] = nums[r]*nums[r];
                j--;
                r--;
            }else{
                ans[j] = nums[l]*nums[l];
                j--;
                l++;
            }
        }
        
        return ans;
    }
}