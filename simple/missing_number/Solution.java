package missing_number;

public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[]{3,0,1};
    System.out.println(missingNumber(nums));
  }

  public static int missingNumber(int[] nums) {
    int ret = nums.length;
    for (int i = 0; i < nums.length; i++) {
      ret = ret + i - nums[i];
    }
    return ret;
  }
}
