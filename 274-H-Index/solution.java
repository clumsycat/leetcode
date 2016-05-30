public class Solution {
    public int hIndex(int[] citations) {
int size= citations.length;
		if(size==0)
			return 0;
		int map[] = new int[size+1];
		for(int i = 0 ; i < size ; i++)
		{
			if(citations[i]<size)
				map[citations[i]]++;
			else
				map[size]++;
		}
		int acc = 0;
		for(int i = size ; i> 0 ; --i)
		{
			acc+=map[i];
			if(acc>=i)
				return i;
		}
		return 0;
	}
}