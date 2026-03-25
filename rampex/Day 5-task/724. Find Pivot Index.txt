class Solution {
    public int pivotIndex(int[] nums) {
        int l=0;
        int r=0;
        for(int num:nums)
        r+=num;

        for(int ind=0;ind<nums.length;ind++){
            r=r-nums[ind];
            if(l==r)
            return ind;
            l=l+nums[ind];
        }
        return -1;
    }
}
