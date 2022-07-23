class Solution {
    public int majorityElement(int[] nums) {
        int i = 0;
        int count = 0 ;
        int me = nums[0];
        while( i < nums.length){
            if( i==0){
                count++;
            }else if(me == nums[i]){
                count++;
            }else{
                --count;
                if(count == 0){
                    me  = nums[i];
                    count++;
                }
            }
            i++;
        }
        return me;
    }
}