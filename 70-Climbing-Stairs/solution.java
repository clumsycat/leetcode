public class Solution {
    public int climbStairs(int n) {
        int first =1,second =1;
        int res = 0;
        if(n<3)
            return n;
        while(--n!=0){
            res = first + second;
            first = second;
            second = res;
        }
        
        return res;
    }
}