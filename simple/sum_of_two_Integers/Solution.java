package sum_of_two_Integers;

public class Solution {
  public static void main(String[] args) {
    int a = 20, b = 30;
    System.out.println(getSum(a, b));
  }

  public static int getSum(int a, int b) {
    while (b != 0) {
      int temp = (a & b) << 1;
      a = a ^ b;
      b = temp;
    }
    return a;
  }
}