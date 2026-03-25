
class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int n:nums){
            if(n%6==0){ 
                sum+=n;
                count++;
            }
        }
        return count==0?0:(sum/count);
    }
}