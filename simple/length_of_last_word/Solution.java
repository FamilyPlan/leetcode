package length_of_last_word;

public class Solution {
  public static void main(String[] args) {
    String s = "b  a  ";
    System.out.println(lengthOfLastWord2(s));
  }
  public static int lengthOfLastWord(String s) {
    if (s.trim().isEmpty()) {
      return 0;
    }
    char[] chars = s.toCharArray();
    int len = 0, prev = 0;
    for (char c : chars) {
      if (c != ' ') {
        len++;
      } else {
        if (len != 0) {
          prev = len;
        }
        len = 0;
      }
    }
    return len == 0 ? prev : len;
  }

  public static int lengthOfLastWord2(String s) {
    int end = s.length() - 1;
    while (end >= 0 && s.charAt(end) == ' ') {
      end--;
    }
    if (end < 0) {
      return 0;
    }
    int start = end;
    while (start >= 0 && s.charAt(start) != ' ') {
      start--;
    }
    return end - start;
  }
}
