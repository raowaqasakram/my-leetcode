
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasingMonotone = true, isDecreasingMonotone = true;

        for (int i = 1; i < nums.length; ++i) {
            isIncreasingMonotone &= nums[i - 1] <= nums[i];
            isDecreasingMonotone &= nums[i - 1] >= nums[i];
        }
        return isIncreasingMonotone || isDecreasingMonotone;
    }
}