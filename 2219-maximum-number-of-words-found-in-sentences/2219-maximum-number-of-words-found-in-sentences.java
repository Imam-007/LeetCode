class Solution {
    public int mostWordsFound(String[] sen) {
        int ans=0;
        for(String val:sen){
            int len=val.split(" ").length;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}