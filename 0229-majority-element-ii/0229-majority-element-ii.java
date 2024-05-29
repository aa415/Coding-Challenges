class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
     int ctr1=0,ctr2 =0;
     int elem1 = Integer.MIN_VALUE ,elem2 =Integer.MIN_VALUE;
        
        for(int i=0; i< nums.length;i++){
            
            if( ctr1 ==0 && nums[i] != elem2){
                ctr1= 1;
                elem1 = nums[i];
            }
            
             else if( ctr2 ==0 && nums[i] != elem1){
                ctr2= 1;
                elem2 = nums[i];
            }
            
            else if(nums[i] == elem1){
                ctr1++;
            }
            else if( nums[i] == elem2){
                ctr2++;
            }
            
            else{
                ctr1--;
                ctr2--;
            }
        }
        
        int res1=0,res2 =0;
        
        int minReq = nums.length/3 ;
        
        for( int i=0; i< nums.length; i++){
            
            if(nums[i] == elem1){
                res1++;
            }
            
            else if( nums[i] == elem2){
                res2++;
            }
        }
        List<Integer> output = new ArrayList<>();
        if(res1 > minReq){
            output.add(elem1);
        }
        
        if(res2> minReq){
            output.add(elem2);
        }
        
        return output;
    }
}