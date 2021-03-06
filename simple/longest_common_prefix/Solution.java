package longest_common_prefix;

public class Solution {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"aa", "a"}));
  }
  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String temp = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(temp) != 0) {
        temp = temp.substring(0, temp.length() - 1);
        if (temp.isEmpty()) {
          return "";
        }
      }
    }
    return temp;
  }
}
