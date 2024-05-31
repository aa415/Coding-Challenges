class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left =0;
        
        int right = nums.length -1;
        
        int mid =0;
        
        while( left <= right){
            
             mid = (left + right)/2;
            
            if(nums[mid] == target) return mid;
            
            else if ( nums[mid] <= target){
                
                //if(target <= nums[mid+1]) return mid+1;
                
                left = mid+1;
            }
            else if( target < nums[mid]){
               
               // if(target >= nums[mid-1]) return mid;
                
                right = mid-1;
            }
            
        }
        
        return left;
    }
}