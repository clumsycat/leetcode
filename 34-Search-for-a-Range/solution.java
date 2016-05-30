public class Solution {
    public int[] searchRange(int[] nums, int target) {

		int size = nums.length;
		int l = 0;
		int r = size;
		int mid;
		int[] res = { -1, -1 };
		while (l < r) {
			mid = l + ( r - l ) / 2;
			if (mid == 0 && nums[mid] == target) {
				res[0] = mid;
				break;
			} else if (mid > 0 && nums[mid - 1] < target && nums[mid] == target) {
				res[0] = mid;
				break;
			}
			if (nums[mid] < target)
				l = mid+1;
			else
				r = mid;
		}
		l = 0;
		r = size;
		while (l <r) {
			mid = l + ( r - l ) / 2;
			if (mid == (size - 1) && nums[mid] == target) {
				res[1] = mid;
				break;
			} else if ( mid < size -1 && nums[mid + 1] > target && nums[mid] == target ) {
				res[1] = mid;
				break;
			}
			if (nums[mid] > target)
				r= mid;
			else
				l = mid+1;
		}
		return res;

	
    }
}