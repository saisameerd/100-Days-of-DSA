class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length == 0){
            return 0 ;
        }
        
        int res  = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            res = Math.max(res , arr[i]);
            
            if(res == i){
                count++;
            }
        }
        
        return count;
    }
}