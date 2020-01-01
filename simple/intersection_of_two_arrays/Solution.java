package intersection_of_two_arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    int[] nums1 = new int[]{4,9,5};
    int[] nums2 = new int[]{9,4,9,8,4};
    for (int i : intersection(nums1, nums2)) {
      System.out.println(i);
    }
  }

  public static int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : nums1) {
      if (map.get(i) == null) {
        map.put(i, 0);
      }
    }

    for (int i : nums2) {
      if (map.get(i) != null && map.get(i) == 0) {
        list.add(i);
        map.put(i, 1);
      }
    }
    int[] ret = new int[list.size()];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = list.get(i);
    }
    return ret;
  }
}
