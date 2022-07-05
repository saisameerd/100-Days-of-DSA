class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        
        int st = 0;
        int end = nums.length-1;
        
        int mid = 0;
        
        while(st <= end){
            mid = (st + end)/2;
            if(nums[mid] < target){
                st = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }
        
        return ans;
        
        
    }
}