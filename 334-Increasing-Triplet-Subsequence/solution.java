public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n<=2)
            return false;
        int min = nums[0];
        int mid = Integer.MAX_VALUE;
        for(int i=1; i<n; i++)
        {
            if(nums[i] > mid)
                return true;
            else if(nums[i] <= min)
                min = nums[i];
            else if(nums[i] > min && nums[i] < mid)
            {
                mid=nums[i];
            }

        }
        return false;
        
    }
}