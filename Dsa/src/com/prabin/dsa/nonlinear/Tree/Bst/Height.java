package com.prabin.dsa.nonlinear.Tree.Bst;




public class Height {


    public int computeHeight(Bst.node root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = computeHeight(root.left);
        int rightHeight = computeHeight(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}