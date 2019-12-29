package count_and_say;

public class Solution {
  public static void main(String[] args) {
    int n = 20;
    System.out.println(countAndSay(n));
  }
  public static String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }
    String str = "1";
    for (int i = 2; i <= n; i++) {
      StringBuilder sb = new StringBuilder();
      char pre = str.charAt(0);
      int count = 1;
      for (int j = 1; j < str.length(); j++) {
        char c = str.charAt(j);
        if (pre == c) {
          count++;
        } else {
          sb.append(count).append(pre);
          pre = c;
          count = 1;
        }
      }
      sb.append(count).append(pre);
      str = sb.toString();
    }
    return str;
  }
}
