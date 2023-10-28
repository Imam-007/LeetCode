class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int[] count=new int[1000];
        for(int num:nums){
            ans=ans+count[num]++;
        }
        return ans;
    }
}