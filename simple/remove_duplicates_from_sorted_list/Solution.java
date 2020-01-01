package remove_duplicates_from_sorted_list;

public class Solution {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(1);
    ListNode l3 = new ListNode(1);
    l1.next = l2;
    l2.next = l3;
    System.out.println(deleteDuplicates(l1));
  }
  public static ListNode deleteDuplicates(ListNode head) {
    ListNode currentNode = head;
    while (currentNode != null && currentNode.next != null) {
      if (currentNode.val == currentNode.next.val) {
        currentNode.next = currentNode.next.next;
      } else {
        currentNode = currentNode.next;
      }
    }
    return head;
  }
  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      ListNode currentNode = this;
      sb.append(currentNode.val);
      while (currentNode.next != null) {
        sb.append("->");
        sb.append(currentNode.next.val);
        currentNode = currentNode.next;
      }
      return sb.toString();
    }
  }
}
