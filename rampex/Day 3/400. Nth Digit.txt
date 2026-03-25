class Solution {
    public int findNthDigit(int n) {
        long digit=1;
        long count=9;
        long start=1;
        long tcount=9;
        while(n>tcount){
            n-=tcount;
            digit++;
            count*=10;
            start*=10;
            tcount=count*digit;
        }
        long num=start+(n-1)/digit;
        String str=Long.toString(num);
        int ind=(n-1)%(int)digit;
        char ch=str.charAt(ind);
        return ch-'0';
    }
}   
