class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length ;
        int[] minf = new int[n];
        minf[n-1] = arr[n-1];
        for(int i = n-2 ; i >=0 ; i--){
            minf[i] = Math.min(minf[i+1] , arr[i]);
        }
        
        int res = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n-1 ; i++){
            max = Math.max(arr[i] , max);
            
            if(max <= minf[i+1]){
                res++;
            }
        }
        
        return res+1;
        
    }
}