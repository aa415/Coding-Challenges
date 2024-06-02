class Solution {
    public int findMin(int[] nums) {
        
        int left =0;
        int right = nums.length-1;
        
        if(nums[left] <= nums[right])
        {
            return nums[0];
        }
        
        int mid =0;
        
        while( left <= right){
            
            mid = (left+right)/2;
            
            if( nums[left] <= nums[mid]){
                
                if(nums[mid] > nums[mid+1]) return nums[mid+1];
                
                left = mid+1;
            }
            
            else if( nums[mid] <= nums[right]){
                
                if( nums[mid] < nums[mid-1]) return nums[mid];
                
                right = mid-1;
            }
        }
        return -1;
    }
}