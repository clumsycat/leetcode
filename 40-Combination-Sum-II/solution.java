public class Solution {
    List<List<Integer>> results = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum2(int[] candidates,
			int target) {
		List<Integer> res = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combination(candidates, target, 0, res);
		return results;
	}
    private void combination(int[] candidates, int target,
			int Lastindex, List<Integer> res) {
		// System.out.println(res+"  "+ target + "  "+ results);
		if(target < 0)
			return;
		else if (target == 0) {
			List<Integer> temp = new ArrayList(res);
			//if (!results.contains(temp)) {
				results.add(temp);
				return;
			//}
		} else if (target > 0) {
			for (int i = Lastindex; i < candidates.length; i++) {
				if (i > Lastindex && candidates[i] == candidates[i-1]) continue;
				res.add(candidates[i]);
				combination(candidates, target - candidates[i], i + 1, res);
				res.remove(res.size() - 1);
			}
		}
	}
}