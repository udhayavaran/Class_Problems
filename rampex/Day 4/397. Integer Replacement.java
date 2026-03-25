
class Solution {
    public int integerReplacement(int n) {
        int ans=0;
        long num=n;
        while(num>1){
            if(num%2==0) num/=2;
            else{
                if(num%4==1 || num==3) num--;
                else num++;
            }
            ans++;
        }
        return ans;
    }
}