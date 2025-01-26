public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element
        for (int i = 0; i < nums.length; i++) {
            // Check subsequent elements
            for (int j = i + 1; j < nums.length; j++) {
                // If a pair is found that adds up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return their indices
                }
            }
        }
        // Throw an exception if no solution is found (per problem, won't happen)
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        Solution solution = new Solution();
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}
