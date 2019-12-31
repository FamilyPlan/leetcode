package first_unique_character_in_a_string;

import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    String s = "leetcode";
    System.out.println(firstUniqChar(s));
  }

  public static int firstUniqChar(String s) {
    char[] chars = s.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : chars) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < chars.length; i++) {
      if (map.get(chars[i]) == 1) {
        return i;
      }
    }
    return -1;
  }
}
