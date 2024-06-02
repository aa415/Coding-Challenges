class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        
        int left =1;
        int right = nums.length-2;
        
        if( nums.length ==1) return nums[0];
        
        if( nums[0] != nums[1]) return nums[0];
        
        if(nums[right] != nums[right+1]) return nums[right+1];
        
        
        int mid =0;
        while( left <= right){
            mid = (left +right)/2;
            
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            
            
            if((mid%2 ==1 && nums[mid] == nums[mid-1]) || (mid%2 ==0 && nums[mid] == nums[mid+1])) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return -1;
    }
}