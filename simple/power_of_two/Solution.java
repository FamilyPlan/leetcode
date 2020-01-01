package power_of_two;

public class Solution {
  public static void main(String[] args) {
    int n = 213;
    System.out.println(isPowerOfTwo(n));
  }
  public static boolean isPowerOfTwo(int n) {
    if (n == 0) {
      return false;
    }
    while (n % 2 == 0) {
      n = n / 2;
    }
    return n == 1;
  }

  /*
   * 如果n是2的幂次方，那么最高位是1，其余均为0，n-1则刚好相反，那么二者与之后一定为0
   */
  public static boolean isPowerOfTwo2(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }
}
