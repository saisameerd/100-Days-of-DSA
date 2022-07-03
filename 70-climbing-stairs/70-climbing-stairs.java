class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int ans= count(n ,dp);
        return ans;
    }
    public int count(int n , int[] dp){
        if( n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        if(dp[n]!= 0){
            return dp[n];
        }
        
        int steps_1 = count(n-1 , dp);
        int steps_2 = count(n-2 , dp);
        
        return dp[n] = steps_1 + steps_2;
    }
}