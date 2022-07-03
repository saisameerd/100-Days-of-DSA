class Solution {
    public int wiggleMaxLength(int[] nums) {
         if(nums.length == 1)return 1;
        int prevsign = nums[1] - nums[0];
        int count = prevsign!=0 ? 2 : 1;
        
        for(int i = 2 ; i < nums.length ;i++){
            int currsign = nums[i] - nums[i-1];
            if(prevsign >= 0 && currsign < 0 || prevsign<=0 && currsign >0){
                count++;
                prevsign = currsign;
            }
        }
        
        return count;
    }
}