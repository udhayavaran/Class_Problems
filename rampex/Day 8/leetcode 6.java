class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int n=s.length();
        char[][] arr=new char[numRows][n];
        boolean dir=true;
        int r=0;
        int c=0;
        for(char ch:s.toCharArray()){
            arr[r][c]=ch;
            if(dir){
                if(r==numRows-1){
                    dir=false;
                    r--;
                    c++;
                }
                else{
                    r++;
                }
            }
            else{
                if(r==0){
                    dir=true;
                    r++;
                }
                else{
                    r--;
                    c++;
                }
            }

        }
        StringBuilder sb=new StringBuilder();
        for(char[]c1:arr){
            for(char ch1:c1){
                if(ch1!='\0'){
                    sb.append(ch1);
                }
            }
        }
        return sb.toString();
        
    }
}