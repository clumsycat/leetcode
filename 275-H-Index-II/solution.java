public class Solution {
    public int hIndex(int[] citations) {
        
		int size= citations.length;
		if(size==0)
			return 0;
		int n=size;
		for(int i = 0 ; i<size ; i++)
		{
			if(n<=citations[i])
				return n;
			n--;
		}
		return 0;
	}
}