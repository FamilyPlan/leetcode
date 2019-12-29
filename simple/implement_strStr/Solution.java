package implement_strStr;

public class Solution {
  public static void main(String[] args) {
    String haystack = "aasdas";
    String needle = "as";
    System.out.println(strStr(haystack, needle));
  }
  public static int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }
    if (haystack.length() == 0) {
      return -1;
    }
    char[] chars = haystack.toCharArray();
    char[] chars1 = needle.toCharArray();
    int ret = -1;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == chars1[0]) {
        ret = i;
        for (int j = 1; j < chars1.length; j++) {
          if (i+j < chars.length && chars[i+j] == chars1[j] && ret != -1) {
            ret = (ret == -1) ? i : ret;
          } else {
            ret = -1;
          }
        }
        if (ret != -1) {
          return ret;
        }
      }
    }
    return ret;
  }
}
