package merge_wwo_sorted_lists;

public class Solution {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l12 = new ListNode(2);
    ListNode l13 = new ListNode(4);
    l1.next = l12;
    l12.next = l13;
    ListNode l2 = new ListNode(1);
    ListNode l22 = new ListNode(3);
    ListNode l23 = new ListNode(4);
    l2.next = l22;
    l22.next = l23;
    System.out.println(mergeTwoLists(l1, l2));
  }
  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode prevHead = new ListNode(-1);
    ListNode prev = prevHead;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        prev.next = l1;
        l1 = l1.next;
      } else {
        prev.next = l2;
        l2 = l2.next;
      }
      prev = prev.next;
    }
    prev.next = l1 == null ? l2 : l1;
    return prevHead.next;
  }

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }

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

