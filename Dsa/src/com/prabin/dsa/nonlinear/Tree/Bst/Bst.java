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
            System.out.print(root.key+" ");
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

    public node ancestor(node root, int n1 , int n2 ){

        if(root == null){
            return null;
        }

        if(n1<root.key && n2 <root.key){
           return ancestor(root.left,n1,n2);
        }
        else if(n1>root.key && n2>root.key){
           return ancestor(root.right,n1,n2);
        }
        else{
            return root;
        }
       // return root;

    }


//    public int height(node root){
//        if(root == null){
//            return -1;
//        }
//        return 1+Math.max(height(root.left),height(root.right));
//    }


    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.insert(20);
        bst.insert(15);
        bst.insert(25);
        bst.insert(14);
        bst.insert(26);
        bst.insert(14);
        bst.insert(16);

        bst.inorder(bst.root);
        System.out.println();
        int h = bst.getHeight();;
        System.out.println(h);
        System.out.println();
       node res = bst.ancestor(bst.root, 14,24);

        System.out.println(res.key);

        bst.delete(bst.root,20);
        System.out.println();
        bst.inorder(bst.root);

    }

    private node  delete(node root,int val) {
        if(root==null){
            return null;
        }

        if(val<root.key){
            root.left =delete(root.left,val);
        }
        else if(val>root.key){
            root.right=delete(root.right,val);
        }
        else{
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;

            root.key =min(root.right);
            delete(root.right,root.key);
        }
return root;
    }

    int min(node root){
        if(root.left!=null){
            root=root.left;
        }
        return root.key;
    }

}
