package reverse_integer;

public class Solution {
  public static void main(String[] args) {
    System.out.println(getResult(1999999999));
  }
  public static int getResult(int x) {
    int flag = 1;
    String xString = Integer.toString(x);
    if (xString.startsWith("-")) {
      flag = -1;
      xString = xString.substring(1);
    }
    char[] chars = xString.toCharArray();
    char[] retChars = new char[chars.length];
    for (int i = chars.length - 1; i >= 0; i--) {
      retChars[chars.length - 1 - i] = chars[i];
    }
    Long retLong = Long.valueOf(new String(retChars));
    if (retLong > Integer.MAX_VALUE || retLong < Integer.MIN_VALUE) {
      return 0;
    }
    return (int)(retLong * flag);
  }
}
