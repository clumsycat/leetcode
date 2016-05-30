public class Solution {
	public List<List<Integer>> results = new ArrayList<>();

	public List<List<Integer>> permute(int[] nums) {
		List <Integer> res = new ArrayList<>();
		res.add(nums[0]);
		results.add(res);
		for(int i = 1; i < nums.length; i++)
		{
			List<List<Integer>> new_results = new ArrayList<>();
			for(int j = 0; j <= i ; j++)
			{
				for(List<Integer> r : results)
				{
					List<Integer> new_r = new ArrayList<>(r);
					new_r.add(j, nums[i]);
					new_results.add(new_r);
				}
			}
			results= new_results;
		}
		return results;
	}
}