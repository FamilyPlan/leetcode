package intersection_of_two_arrays_II;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    int[] nums1 = new int[]{4,9,5};
    int[] nums2 = new int[]{9,4,9,8,4};
    for (int i : intersect(nums1, nums2)) {
      System.out.println(i);
    }
  }
  public static int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] temp = new int[nums1.length];
    int j = 0;
    for (int i : nums1) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    for (int i : nums2) {
      if (map.get(i) != null && map.get(i) > 0) {
        temp[j++] = i;
        map.put(i, map.get(i) - 1);
      }
    }
    return Arrays.copyOfRange(temp, 0, j);
  }
}
