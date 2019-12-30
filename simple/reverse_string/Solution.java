package reverse_string;

public class Solution {
  public static void main(String[] args) {
    char[] s = new char[]{'h','e','l','l','o'};
    reverseString(s);
    for (char c : s) {
      System.out.println(c);
    }
  }

  public static void reverseString(char[] s) {
    char temp = ' ';
    for (int i = 0; i < s.length / 2; i++) {
      temp = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = temp;
    }
  }
}
