public class Solution {
    List<List<Integer>> results = new ArrayList<List<Integer>>();
	int[] candidates = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    public List<List<Integer>> combinationSum3(int k, int target) {
        List<Integer> res = new ArrayList<Integer>();
		combination(candidates, target,k, 0, res);
		return results;
    }
    private void combination(int[] candidates, int target, int num,
			int Lastindex, List<Integer> res) {
		if (num ==0 && target == 0 ) {
			results.add(new ArrayList(res));
			return;
		} else if ( num > 0 && target > 0) {
			for (int i = Lastindex; i < candidates.length; i++) {
				res.add(candidates[i]);
				combination(candidates, target - candidates[i], num -1, i + 1, res);
				res.remove(res.size() - 1);
			}
		}
	}
}