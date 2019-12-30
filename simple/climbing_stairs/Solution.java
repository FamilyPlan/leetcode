package climbing_stairs;

public class Solution {
  public static void main(String[] args) {
    int n = 40;
    System.out.println(climbStairs3(n));
  }

  /*
   * 记忆化递归
   * 时间复杂度：O(n)
   * 空间复杂度：O(n)
   */
  public static int climbStairs(int n) {
    int[] nums = new int[n+1];
    return climbStairsCore(0, n, nums);
  }

  /*
   * 记忆化递归核心算法
   */
  public static int climbStairsCore(int i, int n, int[] nums) {
    if (i > n) {
      return 0;
    }
    if (i == n) {
      return 1;
    }
    if (nums[i] > 0) {
      return nums[i];
    }
    nums[i] = climbStairsCore(i + 1, n, nums) + climbStairsCore(i + 2, n, nums);
    return nums[i];
  }

  /*
   * 动态规划
   * 时间复杂度：O(n)
   * 空间复杂度：O(n)
   */
  public static int climbStairs2(int n) {
    int[] nums = new int[n+1];
    nums[1] = 1;
    nums[2] = 2;
    for (int i = 3; i <= n; i++) {
      nums[i] = nums[i-1] + nums[i-2];
    }
    return nums[n];
  }

  /*
   * 斐波那契数
   * 时间复杂度：O(n)
   * 空间复杂度：O(1)
   */
  public static int climbStairs3(int n) {
    if (n == 1) {
      return 1;
    }
    int one = 1;
    int two = 2;
    for (int i = 3; i <= n; i++) {
      int three = one + two;
      one = two;
      two = three;
    }
    return two;
  }

}
