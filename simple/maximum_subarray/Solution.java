package maximum_subarray;

public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[]{-2,1,-3,4};
    System.out.println(maxSubArray2(nums));
  }

  /*
   * 算法一：分治算法
   * 时间复杂度：O(nlogn)
   * 空间复杂度：O(logn)
   * 左半部分、右半部分、从中间到2边的完整部分
   * 为什么有可能是在左右半部分：比如{2,8,-11,4,5,-1,2,3}，最大值子数组是{2,8}
   */
  public static int maxSubArray(int[] nums) {
    return compute(nums, 0, nums.length - 1);
  }

  /*
   * 算法二：贪心算法
   * 时间复杂度：O(n)
   * 空间复杂度：O(1)
   */
  public static int maxSubArray2(int[] nums) {
    int max = nums[0];
    int currentSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      max = Math.max(max, currentSum);
    }
    return max;
  }

  public static int compute(int[] nums, int left, int right) {
    if (left == right) {
      return nums[left];
    }
    int mid = (left+right) / 2;
    int leftNum = compute(nums, left, mid);
    int rightNum = compute(nums, mid + 1, right);
    int totalNum = crossMax(nums, left, right, mid);
    return Math.max(Math.max(leftNum, rightNum), totalNum);
  }
  public static int crossMax(int[] nums, int left, int right, int mid) {
    if (left == right) {
      return nums[left];
    }
    int leftSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int i = mid; i > left - 1; i--) {
      currentSum += nums[i];
      leftSum = Math.max(leftSum, currentSum);
    }
    int rightSum = Integer.MIN_VALUE;
    currentSum = 0;
    for (int i = mid + 1; i < right + 1; i++) {
      currentSum += nums[i];
      rightSum = Math.max(rightSum, currentSum);
    }
    return leftSum + rightSum;
  }

}
