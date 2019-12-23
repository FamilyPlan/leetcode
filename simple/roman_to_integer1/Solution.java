package leetcode.simple.roman_to_integer;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  public static void main(String[] args) {
    String input = "LVIII";
    Map<Character, Integer> map = new HashMap();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int len = input.length();
    int result = map.get(input.charAt(len - 1));
    for (int i = len - 2;  i >= 0; i--) {
      if (map.get(input.charAt(i)) >= map.get(input.charAt(i + 1))) {
        result += map.get(input.charAt(i));
      } else {
        result -= map.get(input.charAt(i));
      }
    }
    System.out.println(result);
  }
}