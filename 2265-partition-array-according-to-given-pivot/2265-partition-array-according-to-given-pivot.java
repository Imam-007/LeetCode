class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int size=nums.length;
        int[] ans=new int[size];
        int low=0,high=size-1;

        for(int i=0;i<size;i++){
            if(nums[i]<pivot){
                ans[low++]=nums[i];
            }
             if(nums[size-1-i]>pivot){
                ans[high--]=nums[size-1-i];
            }
        }

        while(low<=high){
            ans[low++]=pivot;
            ans[high--]=pivot;
        }
        return ans;
    }
}