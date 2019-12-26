package palindrome_number;

public class Solution {
  public static void main(String[] args) {
    int x = 312213;
    System.out.println("isPalindrome: " + isPalindromeByNum(x));
  }
  public static boolean isPalindrome(int x) {
    String str = Integer.toString(x);
    char[] chars = str.toCharArray();
    int i = 0, j = chars.length - 1;
    while (i <= j) {
      if (chars[i] != chars[j]) {
        return false;
      } else {
        i++;
        j--;
      }
    }
    return true;
  }

  public static boolean isPalindromeByNum(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    int temp = 0;
    while (x > temp) {
      temp = x % 10 + temp * 10;
      x = x / 10;
    }
    return x == temp || x == temp / 10;
  }
}
