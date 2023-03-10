package com.leetcode.offer;

/**
 * 输入一棵二叉树的根节点，
 * 判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * @Author Liuyunda
 * @Date 2023/2/14 20:29
 */
public class Questions55II {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }
    public int  recur(TreeNode node) {
        if (node ==null) {
            return 0;
        }
        int left = recur(node.left);
        if (left == -1) return -1;
        int right = recur(node.right);
        if (right == -1) return -1;
        return Math.abs(left -right) < 2?Math.max(left, right) + 1 : -1;
    }
}
