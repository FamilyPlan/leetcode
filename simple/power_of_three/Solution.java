package power_of_three;

public class Solution {
  public static void main(String[] args) {
     int n = 28;
     System.out.println(isPowerOfThree2(n));
  }

  public static boolean isPowerOfThree(int n) {
    while (n % 3 == 0 && n > 1) {
      n = n / 3;
    }
    return n == 1;
  }

  public static boolean isPowerOfThree2(int n) {
    return n > 0 && 1162261467 % n == 0;
  }
}
