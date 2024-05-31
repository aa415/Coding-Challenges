class Solution {
    public int maxProduct(int[] nums) {
        
        int prefixProd =1;
        int suffixProd =1;
        
        int maxOutput = Integer.MIN_VALUE;
        
        for( int i=0;i<nums.length;i++){
            if(prefixProd ==0){
                prefixProd =1;
            }
            
            if(suffixProd ==0){
                suffixProd =1;
            }
            
            prefixProd *= nums[i];
            
            suffixProd *= nums[nums.length-i-1];
            
            maxOutput = Math.max(maxOutput, Math.max(prefixProd,suffixProd));
        }
                                 
                                 return maxOutput;
        
    }
}