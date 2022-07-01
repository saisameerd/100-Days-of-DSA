class Solution {
    public int[] twoSum(int[] num, int target) {
        int f = 0 , e = num.length - 1;
        int[] ans = new int[2];
        while(f < e){
            if(num[f]+num[e] < target){
                f++;
            }
            else if(num[f]+num[e] > target){
                e--;
            }
            else {
                ans[0] = f+1;
                ans[1] = e + 1;
                break;
            }
        }
        return ans ;
    }
}