package valid_palindrome;

public class Solution {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
    int i = 0, j = chars.length - 1;
    while (i < j) {
      if (chars[i] == chars[j]) {
        i++;
        j--;
      } else {
        return false;
      }
    }
    return true;
  }
}
