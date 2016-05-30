public class Solution {
    public int[] twoSum(int[] numbers, int target) {
	        int index[]= new int[2];
	        HashMap<Integer,Integer> map=new HashMap();
	        for(int i=0;i<numbers.length;i++){
	        	if(map.get(target-numbers[i])!= null)
	        	{
	        		index[0]= map.get(target-numbers[i]);
	        		index[1]= i;
	        	}
	        	else
	        		map.put(numbers[i],i);}
        return index;
    }
}