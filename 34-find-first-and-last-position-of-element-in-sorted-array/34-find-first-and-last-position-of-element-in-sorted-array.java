class Solution {
   
    public   int[] searchRange(int[] nums, int target) {
        int firstOccurrence = search(nums, target, true);

        int secondOccurrence = search(nums, target, false);

        return new int[] {firstOccurrence, secondOccurrence};
    }


    private   int search(int[] nums, int target, boolean findFirstOccurrenceIndex) {
        int ans = -1;
        int start = 0;

        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            }

            if (target == nums[mid]) {
                if (findFirstOccurrenceIndex) {
                    end = mid - 1;
                }

                if (!findFirstOccurrenceIndex) {
                    start = mid + 1;
                }
                ans = mid;
            }
        }
        return ans;
    }
}