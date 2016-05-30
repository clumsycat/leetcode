public class Solution {

    List <List<Integer>>results = new ArrayList<List<Integer>>();
    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
    	
    	List<Integer> res = new ArrayList<Integer>();
    	Arrays.sort(candidates);
    	combination(candidates, target, 0, res);    	
		return results;
    }

	private  void combination(int[] candidates, int target, int Lastindex, List<Integer> res) {
		if(target==0)
		{
			results.add(new ArrayList(res));
		}else if( target>0)
		{
			for(int i = Lastindex ; i<candidates.length && candidates[i]<=target; i++){
				res.add(candidates[i]);
				combination(candidates,target-candidates[i],i,res);
				res.remove(res.size()-1);
			}
		}		
	}
}