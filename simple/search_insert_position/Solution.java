package search_insert_position;

public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[]{1,3,5,6};
    int target = 4;
    System.out.println(searchInsertByBinary(nums, target));
  }
  public static int searchInsert(int[] nums, int target) {
    int ret = 0;
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return i;
      } else if (target > nums[i]) {
        ret++;
      }
    }
    return ret;
  }
  public static int searchInsertByBinary(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
