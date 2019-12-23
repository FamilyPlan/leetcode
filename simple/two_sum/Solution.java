package leetcode.simple.two_sum;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[]{2, 7, 11, 15};
    int target = 9;
    int ret;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      ret = target - nums[i];
      if (map.containsKey(ret)) {
        System.out.println(i +""+ map.get(ret));
      } else {
        map.put(nums[i], i);
      }
    }
  }
}
