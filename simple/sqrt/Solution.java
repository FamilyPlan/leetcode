package sqrt;

public class Solution {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(mySqrt(x));
  }
  public static int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    long left = 1;
    long right = x / 2;
    while (left < right) {
      long mid = (left + right) / 2 + 1;
      if (mid * mid > x) {
        right = mid - 1;
      } else {
        left = mid;
      }
    }
    return (int) left;
  }
}
