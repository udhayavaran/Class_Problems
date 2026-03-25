class Solution {
    public int singleNumber(int[] nums) {
        int xor=nums[0];
        for(int ind=1;ind<nums.length;ind++){
            xor=xor^nums[ind];
        }
        return xor;
    }
}
