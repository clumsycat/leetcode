public class Solution {
    public String convert(String s, int numRows) {
		int N=numRows;
		int tmp;
		int tmp2;//按一个V型为一组，第i行k1= i+k2=2(n-1) - i %(2(n-1)) + i-1
		String res="";
		int length=s.length();
		if(N==1)
			return s;
		for(int i=0;i<N;i++)
		{
			tmp=i;
			while(tmp<length)
			{
				res+=s.charAt(tmp);
				if(i!=0 && i!=N-1)
				{
				    tmp2 = 2*(N-i-1) + tmp;
				    if(tmp2<length)
				    	res+=s.charAt(tmp2);
				}
				tmp+=2*(N-1);
			}
		}
		return res;
        
    }
}