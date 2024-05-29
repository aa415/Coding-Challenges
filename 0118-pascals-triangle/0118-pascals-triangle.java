class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        int count =0;
        
        for(int i = 0; i<2 && i<numRows;i++){
            List<Integer> output = new ArrayList<>();
            if( i==0){
                output.add(1);
            }
            
            if( i==1){
                output.add(1);
                output.add(1);
            }
            count++;
            res.add(output);
        }
        
        if(numRows >2) {
        
        for( int i=count;i<numRows;i++){
            List<Integer> output = new ArrayList<>();
            output.add(1);
        
            int temp =1;
             List<Integer> prevRec =   res.get(i-1);
            while(temp < i){
            output.add(prevRec.get(temp-1)+prevRec.get(temp));
                temp++;
                
            }
            output.add(1);
            
            res.add(output);
        }
    }
        return res;
    }
    
}