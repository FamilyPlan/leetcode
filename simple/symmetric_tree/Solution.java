package symmetric_tree;

import java.util.LinkedList;

public class Solution {
  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(2);
    TreeNode t4 = new TreeNode(3);
    TreeNode t5 = new TreeNode(3);
    TreeNode t6 = new TreeNode(4);
    TreeNode t7 = new TreeNode(4);
    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t6;
    t3.left = t7;
    t3.right = t5;
    System.out.println(isSymmetric2(t1));
  }
  public static boolean isSymmetric(TreeNode root) {
    return compute(root, root);
  }

  public static boolean isSymmetric2(TreeNode root) {
    LinkedList<TreeNode> list = new LinkedList<>();
    list.add(root);
    list.add(root);
    while (!list.isEmpty()) {
      TreeNode t1 = list.poll();
      TreeNode t2 = list.poll();
      if (t1 == null && t2 == null) {
        continue;
      }
      if (t1 == null || t2 == null) {
        return false;
      }
      if (t1.val != t2.val) {
        return false;
      }
      list.add(t1.left);
      list.add(t2.right);
      list.add(t1.right);
      list.add(t2.left);
    }
    return true;
  }

  public static boolean compute(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return true;
    }
    if (t1 == null || t2 == null) {
      return false;
    }
    return t1.val == t2.val && compute(t1.left, t2.right) && compute(t1.right, t2.left);
  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
}
