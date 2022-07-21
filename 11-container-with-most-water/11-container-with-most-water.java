class Solution {
    public int maxArea(int[] height) {
        int l = 0 ;
        int r = height.length - 1;
        int sum = 0;
        while(l<r){
            int min = Math.min(height[l],height[r]);
            sum = Math.max(sum,min*(r-l));
           if(height[l]<height[r]){
               l++;
           }else{
               r--;
           }
            
        }
        
        return sum;
        
    }
}