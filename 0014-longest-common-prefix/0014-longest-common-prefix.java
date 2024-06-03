class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        StringBuilder sb = new StringBuilder();
        
        if(strs.length ==1) return strs[0];
        
        for( int i=0 ;i<strs[0].length();i++){
            
            char c = strs[0].charAt(i);
            
            for(int j=1;j< strs.length;j++){
                
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        
        return strs[0];
        
    }
}