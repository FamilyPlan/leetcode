package remove_duplicates_from_sorted_array;

public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(nums));
    for (int i : nums) {
      System.out.println(i);
    }
  }
  public static int removeDuplicates(int[] nums) {
    int ret = 1;
    if (nums.length == 1) {
      return 1;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i-1]) {
        nums[ret] = nums[i];
        ret++;
      }
    }
    return ret;
  }
}
