class Solution {
    public int nextGreaterElement(int n) {
        char[] ar = (n+"").toCharArray();
        int i  = ar.length - 1;
        while(i > 0 ){
            if(ar[i-1] >= ar[i]){
                i--;
            }else{
                break;
            }
        }
        
        if(i==0)return -1;
        
        
        int drop = i-1;
        int j = ar.length - 1;
        while(j>drop){
           if(ar[j]>ar[drop]){
               break;
           } 
            j--;
        }
        
        swap(ar, i-1 , j );
        
        int l = i ;
        int r = ar.length - 1;
        
        while(l < r){
            swap(ar ,l , r);
            l++;
            r--;
        }
        
        String res = new String(ar);
        long val = Long.parseLong(res);
        return (val > Integer.MAX_VALUE ? -1 : (int)val);
        
        
    }
    
    void swap (char[] ar, int i , int  j ){
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp; 
    }
}