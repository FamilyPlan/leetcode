package add_binary;

public class Solution {
  public static void main(String[] args) {
    String a = "11";
    String b = "1";
    System.out.println(addBinary2(a, b));
  }

  public static String addBinary(String a, String b) {
    int aLen = a.length() - 1;
    int bLen = b.length() - 1;
    int temp = 0;
    int plus = 0;
    String ret = "";
    while (aLen >=0 && bLen >= 0) {
      temp = Integer.parseInt(a.substring(aLen, aLen + 1)) + Integer.parseInt(b.substring(bLen, bLen+1)) + plus;
      if (temp >= 2) {
        plus = 1;
        temp = temp - 2;
      } else {
        plus = 0;
      }
      aLen--;
      bLen--;
      ret = temp + ret;
    }
    while (aLen >= 0) {
      temp = Integer.parseInt(a.substring(aLen, aLen+1)) + plus;
      if (temp >= 2) {
        plus = 1;
        temp = temp - 2;
      } else {
        plus = 0;
      }
      aLen--;
      ret = temp + ret;
    }
    while (bLen >= 0) {
      temp = Integer.parseInt(b.substring(bLen, bLen+1)) + plus;
      if (temp >= 2) {
        plus = 1;
        temp = temp - 2;
      } else {
        plus = 0;
      }
      bLen--;
      ret = temp + ret;
    }
    return plus == 0 ? ret : 1 + ret;
  }

  public static String addBinary2(String a, String b) {
    int aLen = a.length();
    int bLen = b.length();
    StringBuilder sb = new StringBuilder();
    int plus = 0;
    for (int i = aLen - 1, j = bLen - 1; i >= 0 || j >= 0; i--, j--) {
      int temp = plus;
      temp += i >= 0 ? a.charAt(i) - '0' : 0;
      temp += j >= 0 ? b.charAt(j) - '0' : 0;
      plus = temp / 2;
      sb.append(temp % 2);
    }
    sb.append(plus == 0 ? "" : "1");
    return sb.reverse().toString();
  }
}
