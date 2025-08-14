public class RemoveDuplicateChatgpt {
    public static void main(String[] args) {
        int[] nums = {8,3,5,2, 7, 11, 15};
        int Target = 9;
        int[] result = twoSum(nums, Target);
        if (result != null) {
            System.out.println("The targeted indexes are: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
