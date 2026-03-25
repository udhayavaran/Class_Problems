class Solution {

    static void rever(int start, int end, int[] arr){
        int i=start;
        int j=end;
        while(i<j){
            int num=arr[i];
            arr[i]=arr[j];
            arr[j]=num;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        rever(0, nums.length-1, nums);
        rever(0, (k%nums.length)-1, nums);
        rever((k%nums.length), nums.length-1, nums);
    }
}