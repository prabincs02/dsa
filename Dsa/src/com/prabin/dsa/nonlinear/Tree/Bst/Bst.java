package com.prabin.dsa.nonlinear.Tree.Bst;

public class Bst {


    class node{
        int key;
        node left,right;
        node( int val){
            this.key = val;
            left= null;
            right=null;

        }
    }
    node root;

    public node insert(int val , node root){
        if(root == null){
            return new node(val);
        }

        if(val<root.key){
            root.left =  insert(val, root.left);

        }
        else{
            root.right = insert(val,root.right);
        }
        return root;
    }
    public void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    public void insert(int val){
        if(root == null ){
            root = new node(val);
        }
        else{
            insert( val,root);
        }
    }

    public int getHeight() {
        Height heightCalculator = new Height();
        return heightCalculator.computeHeight(root);
    }


//    public int height(node root){
//        if(root == null){
//            return -1;
//        }
//        return 1+Math.max(height(root.left),height(root.right));
//    }


    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.insert(5);
        bst.insert(8);
        bst.insert(2);
        bst.insert(0);
        bst.insert(1);

        bst.inorder(bst.root);
        System.out.println();
        int h = bst.getHeight();;
        System.out.println(h);
    }
}
