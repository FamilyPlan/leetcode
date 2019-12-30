package plus_one;

public class Solution {
  public static void main(String[] args) {
    int[] digits = new int[]{1,9,9};
    for (int i : plusOne2(digits)) {
      System.out.println(i);
    }
  }

  /*
   * 非常精妙的解法：
   * 情况一：末尾未有进位
   * 情况二：末尾有进位，在中间位置停止
   * 情况三：末尾有进位，直到第一位进位
   */
  public static int[] plusOne2(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      digits[i]++;
      digits[i] = digits[i] % 10;
      if (digits[i] != 0) {
        return digits;
      }
    }
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }

  public static int[] plusOne(int[] digits) {
    boolean flag = false;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (i == digits.length - 1) {
        if (digits[i] == 9) {
          if (i == 0) {
            flag = true;
          } else {
            digits[i - 1] += 1;
          }
          digits[i] = 0;
        } else {
          digits[i] += 1;
        }
      } else {
        if (digits[i] == 10) {
          if (i == 0) {
            flag = true;
          } else {
            digits[i - 1] += 1;
          }
          digits[i] = 0;
        }
      }
    }
    if (!flag) {
      return digits;
    }
    int[] nums = new int[digits.length + 1];
    nums[0] = 1;
    return nums;
  }
}
