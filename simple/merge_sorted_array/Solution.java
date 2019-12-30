package merge_sorted_array;

public class Solution {
  public static void main(String[] args) {
    int[] nums1 = new int[]{1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = new int[]{2,5,6};
    int n = 3;
    merge(nums1, m, nums2, n);
    for (int i : nums1) {
      System.out.println(i);
    }
  }
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = 0, j = 0, p = 0;
    int[] temp = new int[m];
    System.arraycopy(nums1, 0, temp, 0, m);
    while (i < m && j < n) {
      if (temp[i] > nums2[j]) {
        nums1[p++] = nums2[j++];
      } else {
        nums1[p++] = temp[i++];
      }
    }
    if (i < m) {
      System.arraycopy(temp, i, nums1, p, m-i);
    }
    if (j < n) {
      System.arraycopy(nums2, j, nums1, p, n-j);
    }
  }
}
