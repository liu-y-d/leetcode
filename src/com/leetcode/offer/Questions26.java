package com.leetcode.offer;

/**
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * @Author Liuyunda
 * @Date 2023/2/3 20:22
 */
public class Questions26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return (recur(A, B)) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A ==null || A.val != B.val) {
            return false;
        }
        return recur(A.left,B.left) && recur(A.right, B.right);
    }
}
