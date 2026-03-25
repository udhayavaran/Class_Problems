class Solution {
    public int fib(int n) {
        int a=0,b=1;
        if(n==0)
        return a;
        else if(n==1)
        return b;
        for(int ind=2;ind<=n;ind++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
