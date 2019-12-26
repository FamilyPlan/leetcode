package valid_parentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    String s = "([)]";
    System.out.println(isValid(s));
  }
  public static boolean isValid(String s) {
    if(s.length() == 0) {
      return true;
    }
    HashMap<Character, Character> map = new HashMap<>();
    map.put('{', '}');
    map.put('(', ')');
    map.put('[', ']');
    Stack<Character> stack = new Stack<>();
    stack.push(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      if (stack != null && !stack.isEmpty() && null != map.get(stack.peek()) && s.charAt(i) == map.get(stack.peek())) {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
    }
    return stack.isEmpty();
  }
}
